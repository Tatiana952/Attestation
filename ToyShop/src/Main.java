
import Toys.Car;
import Toys.Doll;
import Toys.Robot;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {

        gameUI ui = new gameUI();
        ui.hello();
        int mode = ui.getMode();

        Doll doll = new Doll("Kate", "Blonde hair");
        Robot robot = new Robot("Robocop", "Golden Gun");
        Car car = new Car("Ferrari", "Dark windows");

        while(mode != 3) {
            if (mode == 1) {
                int fondSize = 10;

                ReaderJ readerJ = new ReaderJ();
                JSONObject JSONo = readerJ.readJSON();

                workWithFond workWithFond = new workWithFond();
                Prizes prizes = workWithFond.full(JSONo, fondSize, doll.getFreq(), robot.getFreq(), car.getFreq());

                workWithFond.draw(prizes);

            } else if (mode == 2) {
                System.out.println("Old " + ui.showRates(doll, robot, car));

                Changer chan = new Changer();
                chan.changeFreq(doll, robot, car);

                System.out.println("\nNew " + ui.showRates(doll, robot, car));
                System.out.println(ui.suc());
            }
            mode = ui.getMode();
        }
        ui.bye();
    }
}