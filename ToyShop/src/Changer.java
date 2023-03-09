import Toys.Car;
import Toys.Doll;
import Toys.Robot;

import java.util.Random;

public class Changer {
    public void changeFreq(Doll o1, Robot o2, Car o3) {
        Random r1 = new Random();

        int fr1_new = r1.nextInt(9) + 1;
        int fr2_new = r1.nextInt(9) + 1;
        int fr3_new = 1 - fr1_new - fr2_new;
        int sum = fr1_new + fr2_new + fr3_new;

        while (fr3_new < 1 || sum != 10) {
            fr1_new = (r1.nextInt(9) + 1);
            fr2_new = (r1.nextInt(9) + 1);
            fr3_new = (10 - fr1_new - fr2_new);
            sum = fr1_new + fr2_new + fr3_new;
        }
            o1.setFreq(Double.valueOf(fr1_new) / 10);
            o2.setFreq(Double.valueOf(fr2_new)/ 10);
            o3.setFreq(Double.valueOf(fr3_new) / 10);
        }
}
