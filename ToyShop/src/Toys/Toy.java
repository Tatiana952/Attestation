package Toys;

public abstract class Toy {
    private String name;
    private String ficha;

    protected static int id;
    protected String ID;

    static {
        Toy.id = 0;
    }

    /**
     * Creates example of class Toy
     * @param name toy name
     * @param ficha feature of toy
     */
    public Toy(String name, String ficha) {
        this.ID = String.valueOf(++Toy.id);
        this.name = name;
        this.ficha = ficha;
    }

    @Override
    public String toString() {
        return String.format("ID: %s ----- Name: %s ----- Feature: %s", ID, name, ficha);
    }
}
