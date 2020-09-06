package nl.saxion.cos;

public class Symbol {

    protected String name;
    protected DataType type;
    protected int localSlot;

    public Symbol(DataType type, String name, int localSlot) {
        this.type = type;
        this.name = name;
        this.localSlot = localSlot;
    }

    @Override
    public String toString() {
        return type + " " + name;
    }

}
