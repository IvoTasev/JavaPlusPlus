package nl.saxion.cos;

import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.InputMismatchException;
import java.util.regex.Pattern;

public class Checker extends JavaplusplusBaseVisitor<DataType> {

    private Pattern stringPattern = Pattern.compile("\"[a-zA-Z0-9 ]*\"");
    private Pattern intPattern = Pattern.compile("[1-9][0-9]*");
    private Pattern boolPattern = Pattern.compile(("(true)|(false)"));
    private Pattern methodCallPattern = Pattern.compile("[.*]()");

    private ParseTreeProperty<DataType> types = new ParseTreeProperty<>();

    public ParseTreeProperty<DataType> getTypes() {
        return types;
    }

    private Scope scope = new Scope();

    public Scope getScope() {
        return scope;
    }

    @Override
    public DataType visitExEqualsExpression(JavaplusplusParser.ExEqualsExpressionContext ctx) {

        Symbol variable = scope.lookupVariable(ctx.IDENTIFIER().getText());
        if (variable == null)
            throw new RuntimeException("Variable " + ctx.IDENTIFIER().getText() + " doesn't exist");

        if (variable.type != visit(ctx.expression()))
            throw new RuntimeException("var " + ctx.IDENTIFIER().getText() + " contents dont match its type");

        return null;
    }

//    @Override
//    public DataType visitClass_declaration(JavaplusplusParser.Class_declarationContext ctx) {
//        scope = scope.openScope();
//        visit(ctx.body());
//        scope = scope.closeScope();
//        return null;
//    }

    @Override
    public DataType visitExIntLiteral(JavaplusplusParser.ExIntLiteralContext ctx) {
        types.put(ctx, DataType.INT);
        return DataType.INT;
    }

    @Override
    public DataType visitExStrLiteral(JavaplusplusParser.ExStrLiteralContext ctx) {
        types.put(ctx, DataType.STRING);
        return DataType.STRING;
    }

    @Override
    public DataType visitBoolExpression(JavaplusplusParser.BoolExpressionContext ctx) {
        types.put(ctx, DataType.BOOL);
        return DataType.BOOL;
    }

    @Override
    public DataType visitMultiplicativeExpression(JavaplusplusParser.MultiplicativeExpressionContext ctx) {
        DataType left = visit(ctx.left);
        DataType right = visit(ctx.right);

        if (right != left)
            throw new RuntimeException("variables have different types");
        return left;
    }

    @Override
    public DataType visitAdditiveExpression(JavaplusplusParser.AdditiveExpressionContext ctx) {
        DataType left = visit(ctx.left);
        DataType right = visit(ctx.right);

        if (right != left)
            throw new RuntimeException("variables have different types");
        return left;
    }

    @Override
    public DataType visitComparatorExpression(JavaplusplusParser.ComparatorExpressionContext ctx) {
        DataType left = visit(ctx.left);
        DataType right = visit(ctx.right);

        if (left != right)
            throw new RuntimeException("check statement is comparing two different data types");

        return DataType.BOOL;
    }

    @Override
    public DataType visitAsk(JavaplusplusParser.AskContext ctx) {
        for (DataType t : DataType.values()) {
            if (t.toString().equals(ctx.VAR_TYPE().getText())) {
                types.put(ctx, t);
                return t;
            }
        }
        return super.visitAsk(ctx);
    }


    @Override
    public DataType visitVar_init(JavaplusplusParser.Var_initContext ctx) {
        DataType dataType = null;
        switch (ctx.VAR_TYPE().getText()) {
            case "int":
                dataType = DataType.INT;
                break;
            case "bool":
                dataType = DataType.BOOL;
                break;
            case "String":
                dataType = DataType.STRING;
                break;
            default:
                for (DataType t : DataType.values()) {
                    if (checkVariableType(t, ctx.expression().getText(), true)) {
                        if (t == DataType.METHOD) {
                            String name = (ctx.expression().getText().split("(\\()"))[0];
                            dataType = scope.getMethodType(name);
                        } else {
                            dataType = t;
                        }
                    }
                }
                if (dataType == null)
                    throw new InputMismatchException("value " + ctx.expression().getText() + " doesn't fit its variable!");
                break;
        }
        System.out.println(ctx.expression().getText());
        if (ctx.expression() != null) {
            String name[] = ctx.expression().getText().split("(\\()");
            System.err.println(scope.getMethodType(name[0]));
            if (!name[0].equals("ask")){
                if (name.length == 2 && dataType != scope.getMethodType(name[0])) {
                    throw new RuntimeException("value type doesn't fit variable " + ctx.IDENTIFIER().getText());
                }
            }

        }


        Symbol symbol = new Symbol(dataType, ctx.IDENTIFIER().getText(), scope.getSymbolsSize());
        if (scope.lookupVariable(ctx.IDENTIFIER().getText()) != null) {
            throw new RuntimeException("Variable with that name already exists!");
        }
        types.put(ctx, dataType);
        scope.declareVariable(symbol);
        System.out.println(ctx.IDENTIFIER().getText() + " initialized = " + dataType);

        return super.visitVar_init(ctx);
    }

    @Override
    public DataType visitCheck(JavaplusplusParser.CheckContext ctx) {
        if (visit(ctx.expression()) != DataType.BOOL)
            throw new RuntimeException("check expression isnt boolean");
        return super.visitCheck(ctx);
    }

    @Override
    public DataType visitFunc_init(JavaplusplusParser.Func_initContext ctx) {
        boolean hasVars = false;
        String signature = null;
        DataType returnType = null;
        if (scope.lookUpMethod(ctx.IDENTIFIER().getText()) != null) {
            throw new RuntimeException("Method " + ctx.IDENTIFIER().getText() + " already exists!");
        }
        if (!ctx.func_type().getText().equals("void")) {
            switch (ctx.func_type().getText()) {
                case "int":
                    returnType = DataType.INT;
                    break;
                case "bool":
                    returnType = DataType.BOOL;
                    break;
                case "String":
                    returnType = DataType.STRING;
                    break;
                default:
                    throw new RuntimeException("Incompatible return type " + ctx.func_type().getText());
            }
            if (ctx.return_statement() == null) {
                throw new RuntimeException("wheres your return statement bro ? :(");
            }
            getTypes().put(ctx, returnType);
        } else {
            if (ctx.return_statement() != null) {
                throw new RuntimeException("no return statement required :(");
            }
        }

        if (ctx.func_vars() == null) {
            scope.declareMethod(ctx.IDENTIFIER().getText(), "", ctx.func_type().getText());
//            return null;
        } else {
            scope = scope.openScope();
            hasVars = true;
            for (JavaplusplusParser.Func_varContext context : ctx.func_vars().func_var()) {
                if (context.VAR_TYPE().getText().equals("auto")) {
                    throw new RuntimeException("\"auto\" is not allowed when declaring a function");
                } else {
                    DataType dataType = null;
                    switch (context.VAR_TYPE().getText()) {
                        case "int":
                            dataType = DataType.INT;
                            break;
                        case "bool":
                            dataType = DataType.BOOL;
                            break;
                        case "String":
                            dataType = DataType.STRING;
                            break;
                    }
                    Symbol symbol = new Symbol(dataType, context.IDENTIFIER().getText(), scope.getSymbolsSize());
                    scope.declareVariable(symbol);
                    System.out.println(context.IDENTIFIER().getText() + " declared = " + dataType);
                }
            }
            signature = getSignature(ctx.func_vars());
        }


        System.out.println(ctx.IDENTIFIER().getText() + " initialized = " + ctx.func_type().getText());
        scope = scope.openScope();
        visit(ctx.block());
        if (!ctx.func_type().getText().equals("void")) {
            if (visit(ctx.return_statement().expression()) != returnType) {
                throw new RuntimeException("return value should have type " + returnType.toString());
            }
        }
        scope = scope.closeScope();
        if (hasVars)
            scope = scope.closeScope();
        scope.declareMethod(ctx.IDENTIFIER().getText(), signature, ctx.func_type().getText());

        return null;
    }


    @Override
    public DataType visitFunc_var(JavaplusplusParser.Func_varContext ctx) {
        DataType dataType = null;
        switch (ctx.VAR_TYPE().getText()) {
            case "int":
                dataType = DataType.INT;
                break;
            case "bool":
                dataType = DataType.BOOL;
                break;
            case "String":
                dataType = DataType.STRING;
                break;
            default:
                for (DataType t : DataType.values()) {
                    if (checkVariableType(t, ctx.expression().getText(), true)) {
                        System.out.println(t);
                        dataType = t;
                    }
                }
                if (dataType == null)
                    throw new InputMismatchException("value " + ctx.expression().getText() + " doesn't fit its variable!");
                break;
        }
        Symbol symbol = new Symbol(dataType, ctx.IDENTIFIER().getText(), scope.getSymbolsSize());
        types.put(ctx, dataType);
        if (scope.lookupVariable(ctx.IDENTIFIER().getText()) != null) {
            throw new RuntimeException("Variable with that name already exists!");
        }
        scope.declareVariable(symbol);
        return super.visitFunc_var(ctx);
    }

    @Override
    public DataType visitFunc_call(JavaplusplusParser.Func_callContext ctx) {
        if (scope.lookUpMethod(ctx.IDENTIFIER().getText()) != null) {
            if (ctx.params() != null) {
                StringBuilder params = new StringBuilder();
                for (JavaplusplusParser.ExpressionContext arg : ctx.params().expression()) {
                    DataType type = visit(arg);
                    switch (type) {
                        case INT:
                            params.append("I");
                            break;
                        case BOOL:
                            params.append("Z");
                            break;
                        case STRING:
                            params.append("Ljava/lang/String;");
                            break;
                    }
                }
                if (!scope.lookUpMethod(ctx.IDENTIFIER().getText()).equals(params.toString()))
                    throw new IllegalArgumentException("Expected parameters different from actual");
            }
        } else throw new RuntimeException("Method " + ctx.IDENTIFIER().getText() + " not initialized");
        return scope.getMethodType(ctx.IDENTIFIER().getText());
    }

    @Override
    public DataType visitExIdentifier(JavaplusplusParser.ExIdentifierContext ctx) {
        Symbol var = scope.lookupVariable(ctx.IDENTIFIER().getText());

        if (var == null) {

            throw new RuntimeException("variable " + ctx.IDENTIFIER().getText() + " not declared");
        }

        return var.type;
    }

    private String getSignature(JavaplusplusParser.Func_varsContext ctx) {
        StringBuilder parameters = new StringBuilder();
        for (JavaplusplusParser.Func_varContext parameter : ctx.func_var()) {
            switch (parameter.VAR_TYPE().getText()) {
                case "int":
                    parameters.append("I");
                    break;
                case "bool":
                    parameters.append("Z");
                    break;
                case "String":
                    parameters.append("Ljava/lang/String;");
                    break;
            }
        }

        return String.valueOf(parameters);
    }


    public boolean checkVariableType(DataType type, String value, boolean auto) {
        switch (type) {
            case BOOL:
                if (boolPattern.matcher(value).matches())
                    return true;
                break;
            case STRING:
                if (stringPattern.matcher(value).matches())
                    return true;
                break;
            case INT:
                if (intPattern.matcher(value).matches())
                    return true;
                break;
            case METHOD:
                if (methodCallPattern.matcher(value).matches())
                    return true;
                break;
        }
        if (!auto)
            throw new InputMismatchException("value " + value + " doesn't fit its variable!");
        return false;
    }

    @Override
    public DataType visitPrint(JavaplusplusParser.PrintContext ctx) {
        if (scope.lookupVariable(ctx.IDENTIFIER().getText()) == null)
            throw new RuntimeException("Cannot find variable " + ctx.IDENTIFIER().getText());
        return super.visitPrint(ctx);
    }
}
