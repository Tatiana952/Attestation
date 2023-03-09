import Toys.Toy;

import java.util.ArrayList;
import java.util.Iterator;

public class Prizes<T extends Toy> implements Iterator<Toy> {

    private String nameDB;
    public ArrayList<T> toys;

    /**
     * Create fond of prizes
     * @param nameDB name of fond
     */
    public Prizes(String nameDB) {
        this.nameDB = nameDB;
        toys = new ArrayList<>();
    }

    public String getName(){
        return nameDB;
    }

    /**
     * Get size of fond with prizes
     * @return size of fond with prizes
     */
    public int getSize(){
        return toys.size();
    }

    /**
     * Add toy to fond of prizes
     * @param t toy example to add
     */
    public void addToy(T t){
        toys.add(t);
    }


    /**
     * Delete toy from fond of prizes
     * @param t toy example to delete
     */
    public void delToy(int t){
        toys.remove(t);
    }

    public String showFond(){
        String res = "Prizes: \n";
        for (int i = 0; i < toys.size(); i++) {
            res += toys.get(i).toString() + "\n";
        }
        return res;
    }

    /**
     *
     * @return full info about fond of prizes
     */
    @Override
    public String toString() {
        return String.format("Name: %s --- Size: %d items --- ", nameDB, getSize());
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Toy next() {
        return null;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }
}
