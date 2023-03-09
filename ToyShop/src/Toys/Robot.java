package Toys;

public class Robot extends Toy {
    private static double freq;

    /**
     * Creates example of class Robot
     * @param name name of Robot
     * @param feature interesting feature of Robot
     */
    public Robot(String name, String feature) {
        super(name, feature);
        this.freq = 0.3;
    }

    /**
     * Get frequency of winnings for Robot
     * @return frequency of winnings for Robot
     */
    public double getFreq(){
        return freq;
    }

    /**
     * Set frequency of winnings for all Robots
     * @param freq frequency of winnings for all Robots
     */
    public void setFreq(double freq){
        this.freq = freq;
    }

    /**
     *
     * @return full info about example of Robot
     */
    @Override
    public String toString() {
        return super.toString(); // + String.format("Frequency: %s%%", String.valueOf(getFreq()*100));
    }
}
