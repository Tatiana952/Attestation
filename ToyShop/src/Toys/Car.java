package Toys;

public class Car extends Toy{
    private static double freq;

    /**
     * Creates example of class Car
     * @param name name of Car
     * @param feature interesting feature of Car
     */
    public Car(String name, String feature) {
        super(name, feature);
        this.freq = 0.5;
    }

    /**
     * Get frequency of winnings for Car
     * @return frequency of winnings for Car
     */
    public double getFreq(){
        return this.freq;
    }

    /**
     * Set frequency of winnings for all Cars
     * @param freq frequency of winnings for all Cars
     */
    public void setFreq(double freq){
        this.freq = freq;
    }

    /**
     *
     * @return full info about example of Car
     */
    @Override
    public String toString() {
        return super.toString(); //+ String.format("Frequency: %s%%", String.valueOf(getFreq()*100));
    }
}
