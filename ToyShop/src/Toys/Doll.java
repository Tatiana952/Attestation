package Toys;

public class Doll extends Toy {

    private static double freq;

    /**
     * Creates example of class Doll
     * @param name name of Doll
     * @param feature interesting feature of Doll
     */
    public Doll(String name, String feature) {
        super(name, feature);
        this.freq = 0.2;
    }

    /**
     * Get frequency of winnings for Doll
     * @return frequency of winnings for Doll
     */
    public double getFreq(){
        return freq;
    }

    /**
     * Set frequency of winnings for Doll
     * @param freq frequency of winnings for Doll
     */
    public void setFreq(double freq){
        this.freq = freq;
    }

    /**
     *
     * @return full info about example of Doll
     */
    @Override
    public String toString() {
        return super.toString(); // + String.format("Frequency: %s%%", String.valueOf(getFreq()*100));
    }

}
