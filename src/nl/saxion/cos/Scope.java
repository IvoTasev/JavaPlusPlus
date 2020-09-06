package nl.saxion.cos;

import java.util.HashMap;
import java.util.Map;

public class Scope {
    private Map<String, Symbol> symbols;
    private Scope parentScope;
    private Map<String, String> methodSignatures;
    private Map<String, String> methodTypes;

    public Scope(Scope parentScope) {
        this.parentScope = parentScope;
        symbols = new HashMap<>();
        methodSignatures = new HashMap<>();
        methodTypes = new HashMap<>();
    }

    public Scope() {
        this(null);
    }


    public void declareVariable(Symbol symbol) {
        symbols.put(symbol.name, symbol);
    }


    public Symbol lookupVariable(String name) {
        Symbol symbol = symbols.get(name);
        if (symbol == null && parentScope != null) {
            symbol = parentScope.lookupVariable(name);
        }
        return symbol;
    }

    public Scope openScope() {
        return new Scope(this);
    }

    public Scope closeScope() {
        return this.parentScope;
    }

    public void declareMethod(String methodName, String methodSignature, String type) {
        methodSignatures.put(methodName, methodSignature);
        methodTypes.put(methodName, type);

    }

    public String lookUpMethod(String methodName) {
        String methodSignature = methodSignatures.get(methodName);
        if (methodSignature == null && parentScope != null)
            methodSignature = parentScope.lookUpMethod(methodName);

        return methodSignature;
    }

    public DataType getMethodType(String name) {
        DataType dataType = null;
        for (Map.Entry<String, String> entry : methodTypes.entrySet()) {
            if (methodTypes.containsKey(name)) {
                String v = entry.getValue();
                switch (v) {
                    case "int":
                        dataType = DataType.INT;
                        return dataType;
                    case "bool":
                        dataType = DataType.BOOL;
                        return dataType;
                    case "String":
                        dataType = DataType.STRING;
                        return dataType;
                }
            }
        }
        if (parentScope != null)
            dataType = parentScope.getMethodType(name);
        return dataType;
    }

    public int getSymbolsSize() {
        int size = symbols.size();
        if (parentScope != null)
            size += parentScope.getSymbolsSize();
        return size;
    }

}
