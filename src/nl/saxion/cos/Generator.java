package nl.saxion.cos;

import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.ArrayList;

public class Generator extends JavaplusplusBaseVisitor<DataType> {

    Scope mainScope;
    JasminBytecode code;
    ParseTreeProperty<DataType> types;
    ArrayList<JavaplusplusParser.Var_initContext> staticVars;
    private String className;
    static int label;
    static int blockLabel;
    static int loopLabel;

    public Generator(JasminBytecode code, Checker checker) {
        this.code = code;
        this.types = checker.getTypes();
        this.mainScope = checker.getScope();
        staticVars = new ArrayList<>();

        System.out.println();
        System.out.println();
    }

    @Override
    public DataType visitClass_declaration(JavaplusplusParser.Class_declarationContext ctx) {
        this.className = ctx.IDENTIFIER().getText();
        code.add(".class public " + className);
        code.add(".super java/lang/Object");

        code.add("\n.method public <init>()V\n" +
                "aload_0\n" +
                "invokenonvirtual java/lang/Object/<init>()V\n" +
                "return\n" +
                ".end method");
        super.visitClass_declaration(ctx);

        addStaticVars();

        return null;
    }

    @Override
    public DataType visitBlock(JavaplusplusParser.BlockContext ctx) {
        mainScope = mainScope.openScope();
        for (JavaplusplusParser.StatementContext c : ctx.statement()) {
            visit(c);
        }
        return null;
    }

    @Override
    public DataType visitVar_init(JavaplusplusParser.Var_initContext ctx) {
        mainScope.declareVariable(new Symbol(types.get(ctx), ctx.IDENTIFIER().getText(), mainScope.getSymbolsSize()));
        if (mainScope.closeScope() == null) {
            staticVars.add(ctx);
            code.add("");
            code.add(".field static " + ctx.IDENTIFIER().getText() + " " + getMethodType(ctx.VAR_TYPE().getText()));
        } else {
            if (ctx.expression() != null) {
                visit(ctx.expression());
                if (String.valueOf(getMethodType(ctx.VAR_TYPE().getText())).equals("Ljava/lang/String;")) {
                    code.add("astore " + mainScope.lookupVariable(ctx.IDENTIFIER().getText()).localSlot);

                } else code.add("istore " + mainScope.lookupVariable(ctx.IDENTIFIER().getText()).localSlot);
            }
        }
        return null;
    }

    @Override
    public DataType visitAsk(JavaplusplusParser.AskContext ctx) {
        code.add("new java/util/Scanner");
        code.add("dup");
        code.add("getstatic java/lang/System/in Ljava/io/InputStream;");
        code.add("invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V");
        System.err.println(getMethodType(ctx.VAR_TYPE().getText()));
        switch (getMethodType(ctx.VAR_TYPE().getText())) {
            case "I":
                code.add("invokevirtual java/util/Scanner/nextInt()I");
                break;
            case "Z":
                code.add("invokevirtual java/util/Scanner/nextBoolean()Z");
                break;
            case "Ljava/lang/String;":
                code.add("invokevirtual java/util/Scanner/next()Ljava/lang/String;");
                break;
        }

        return null;
    }

    @Override
    public DataType visitBoolExpression(JavaplusplusParser.BoolExpressionContext ctx) {
        if (ctx.BOOL().getText().equals("false")) code.add("ldc 0");
            else code.add("ldc 1");
        return super.visitBoolExpression(ctx);
    }

    @Override
    public DataType visitComparatorExpression(JavaplusplusParser.ComparatorExpressionContext ctx) {
        super.visitComparatorExpression(ctx);

        switch (ctx.comp.getText()) {
            case "<":
                code.add("if_icmpge FALSE" + label);
                break;
            case ">":
                code.add("if_icmple FALSE" + label);
                break;
            case "<=":
                code.add("if_icmpgt FALSE" + label);
                break;
            case ">=":
                code.add("if_icmplt FALSE" + label);
                break;
            case "==":
                code.add("if_icmpne FALSE" + label);
                break;
            case "!=":
                code.add("if_icmpeq FALSE" + label);
                break;
            default:

        }

        return null;
    }

    @Override
    public DataType visitBinaryExpression(JavaplusplusParser.BinaryExpressionContext ctx) {

        if (ctx.binary.getText().equals("||")){
            visit(ctx.right);
            code.add("goto BLOCK" + (blockLabel+1));
            visit(ctx.left);
            code.add("goto BLOCK" + (blockLabel+1));
            return null;
        }
        visit(ctx.right);
        visit(ctx.left);

        return null;
    }


    @Override
    public DataType visitLoop(JavaplusplusParser.LoopContext ctx) {
        if (ctx.expression().getText().equals("true")){
            code.add("START" + loopLabel + ":");
            visit(ctx.block());
            code.add("goto START" + loopLabel);
        } else if (ctx.expression().getText().equals("false")) return null;

        int size = mainScope.getSymbolsSize();
        code.add("ldc 0");
        code.add("istore " + size);
        code.add("goto LOOP" + loopLabel);
        code.add("START" + loopLabel + ":");
        visit(ctx.block());
        code.add("iinc "+ size + " " + 1);
        code.add("LOOP" + loopLabel + ":");
        code.add("iload "+size);
        visit(ctx.expression());
        code.add("if_icmplt START"+ loopLabel);
        loopLabel++;

        return null;
    }

    @Override
    public DataType visitExEqualsExpression(JavaplusplusParser.ExEqualsExpressionContext ctx) {

        Symbol var = mainScope.lookupVariable(ctx.IDENTIFIER().getText());


        super.visitExEqualsExpression(ctx);

        if (String.valueOf(getMethodType(var.type.toString())).equals("Ljava/lang/String;")) {
            code.add("astore " + var.localSlot);

        } else code.add("istore " + var.localSlot);

        return null;
    }

    @Override
    public DataType visitExStrLiteral(JavaplusplusParser.ExStrLiteralContext ctx) {
        code.add("ldc " + ctx.STRING().getText());
        return DataType.STRING;
    }

    @Override
    public DataType visitExIntLiteral(JavaplusplusParser.ExIntLiteralContext ctx) {
        code.add("ldc " + ctx.INT().getText());
        return DataType.INT;
    }

    @Override
    public DataType visitAdditiveExpression(JavaplusplusParser.AdditiveExpressionContext ctx) {
        super.visitAdditiveExpression(ctx);

        if (ctx.op.getText().equals("+")) {
            code.add("iadd");
        } else {
            code.add("isub");
        }

        return null;
    }

    @Override
    public DataType visitExIdentifier(JavaplusplusParser.ExIdentifierContext ctx) {
        Symbol symbol = mainScope.lookupVariable(ctx.getText());
        if (symbol == null)
            throw new RuntimeException("variable " + ctx.IDENTIFIER().getText() + " not found");

        if (staticVars.contains(symbol)) {
            String type = symbol.type == DataType.INT ? " I" : " Ljava/lang/String;";
            switch (symbol.type) {
                case BOOL:
                    type = " Z";
                    break;
                case STRING:
                    type = " Ljava/lang/String;";
                    break;
                case INT:
                    type = " I";
                    break;
            }
            code.add("getfield " + "/" + symbol.name + type);
        } else if (symbol.type == DataType.INT)
                code.add("iload " + symbol.localSlot);
            else if (symbol.type == DataType.STRING)
                code.add("aload " + symbol.localSlot);
            else
                code.add("iload " + symbol.localSlot);


        return null;
    }

    @Override
    public DataType visitMultiplicativeExpression(JavaplusplusParser.MultiplicativeExpressionContext ctx) {
        super.visitMultiplicativeExpression(ctx);
        if (ctx.op.getText().equals("/")) {
            code.add("idiv");
        } else {
            code.add("imul");
        }
        return null;
    }

    @Override
    public DataType visitFunc_init(JavaplusplusParser.Func_initContext ctx) {
        mainScope.declareMethod(ctx.IDENTIFIER().getText(), mainScope.lookUpMethod(ctx.IDENTIFIER().getText()), ctx.func_type().getText());
        code.add("");
        if (ctx.IDENTIFIER().getText().equals("main")) {
            code.add(".method public static " + ctx.IDENTIFIER().getText() + "(" + "[Ljava/lang/String;"
                    + ")" + getMethodType(ctx.func_type().getText()));
        } else {
            code.add(".method static " + ctx.IDENTIFIER().getText() + "(" + mainScope.lookUpMethod(ctx.IDENTIFIER().getText())
                    + ")" + getMethodType(ctx.func_type().getText()));
        }
        code.add(".limit stack 99\n" +
                ".limit locals 99");
        if (getMethodType(ctx.func_type().getText()) == null) {
            code.add("return");
        }

        visitChildren(ctx);
        String returnType = getMethodType(ctx.func_type().getText());
        if (!returnType.equals("V")) {
            code.add(String.valueOf(returnType).toLowerCase() + "return");
        } else {
            code.add("return");

        }
        code.add(".end method");
        return null;
    }

    @Override
    public DataType visitFunc_call(JavaplusplusParser.Func_callContext ctx) {
        for (JavaplusplusParser.ExpressionContext context : ctx.params().expression()) {
            visit(context);
        }
        DataType type = mainScope.getMethodType(ctx.IDENTIFIER().getText());
        if (type == null) {
            code.add("invokestatic " + className + "/" + ctx.IDENTIFIER().getText() + "(" +
                    mainScope.lookUpMethod(ctx.IDENTIFIER().getText()) + ")"
                    + "V");
        } else {
            code.add("invokestatic " + className + "/" + ctx.IDENTIFIER().getText() + "(" +
                    mainScope.lookUpMethod(ctx.IDENTIFIER().getText()) + ")"
                    + getMethodType(type.toString()));
        }
        return null;
    }

    @Override
    public DataType visitFunc_vars(JavaplusplusParser.Func_varsContext ctx) {
        mainScope = mainScope.openScope();
        for (JavaplusplusParser.Func_varContext c : ctx.func_var()) {
            DataType type = types.get(c);
            mainScope.declareVariable(new Symbol(type, c.IDENTIFIER().getText(), mainScope.getSymbolsSize()));
        }
//        mainScope = mainScope.closeScope();
        return null;
    }

    public String getMethodType(String type) {

        switch (String.valueOf(type).toLowerCase()) {
            case "int":
                return "I";
            case "string":
                return "Ljava/lang/String;";
            case "void":
                return "V";
            case "bool":
                return "Z";
        }
        return null;
    }

    @Override
    public DataType visitPrint(JavaplusplusParser.PrintContext ctx) {
        boolean isGlobal = false;
        for (JavaplusplusParser.Var_initContext c : staticVars) {
            if (c.IDENTIFIER().getText().equals(ctx.IDENTIFIER().getText())) {
                isGlobal = true;
                break;
            }
        }

        if (isGlobal) {
            code.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
            code.add("getstatic " + className + "/" + ctx.IDENTIFIER().getText() + " " +
                    getMethodType(mainScope.lookupVariable(ctx.IDENTIFIER().getText()).type.toString()));
            code.add("invokevirtual java/io/PrintStream/println(" +
                    getMethodType(mainScope.lookupVariable(ctx.IDENTIFIER().getText()).type.toString())
                    + ")V");
        } else {
            code.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
            if (String.valueOf(getMethodType(mainScope.lookupVariable(ctx.IDENTIFIER().getText()).type.toString())
            ).equals("Ljava/lang/String;")) {
                code.add("aload " + mainScope.lookupVariable(ctx.IDENTIFIER().getText()).localSlot);

            } else code.add("iload " + mainScope.lookupVariable(ctx.IDENTIFIER().getText()).localSlot );

            code.add("invokevirtual java/io/PrintStream/println(" +
                    getMethodType(mainScope.lookupVariable(ctx.IDENTIFIER().getText()).type.toString())
                    + ")V");
        }
        return null;
    }

    @Override
    public DataType visitFunc_var(JavaplusplusParser.Func_varContext ctx) {
        mainScope.declareVariable(new Symbol(types.get(ctx), ctx.IDENTIFIER().getText(), mainScope.getSymbolsSize()));
        return super.visitFunc_var(ctx);
    }

    private void addStaticVars() {
        if (staticVars.size() > 0) {
            code.add("");
            code.add(".method public <clinit>()V ");
            for (JavaplusplusParser.Var_initContext c : staticVars) {
                code.add("ldc " + c.expression().getText());
                code.add("putstatic " + className + "/" + c.IDENTIFIER().getText() + " " + getMethodType(c.VAR_TYPE().getText()));
            }
            code.add("return");
            code.add(".end method");
        }
    }

    @Override
    public DataType visitCheck(JavaplusplusParser.CheckContext ctx) {

        System.out.println(ctx.expression().getText());
        if  (ctx.expression().getText().equals("true")) visit(ctx.block());

        if (!ctx.expression().getText().equals("true") && !ctx.expression().getText().equals("false")) {
            visit(ctx.expression());
            code.add("BLOCK" + ++blockLabel + ":");
            visit(ctx.block());
            code.add("FALSE" + label + ":");
            label++;
        }
        return null;
    }
}
