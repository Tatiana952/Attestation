import Toys.Doll;
import Toys.Robot;
import Toys.Car;
import Toys.Toy;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class workWithFond {

    public Prizes<Toy> full(JSONObject jj, int fondsize, double dWeight, double rWeight, double cWeight){

        JSONArray robotArr = (JSONArray) jj.get("robot");
        JSONArray dollArr = (JSONArray) jj.get("doll");
        JSONArray carArr = (JSONArray) jj.get("car");
        Prizes pr = new Prizes("Fond");

        for (int i = 0; i < fondsize*dWeight; i++) {
            JSONObject temp = (JSONObject) dollArr.get(i);
            String name = String.valueOf(temp.get("Name"));
            String feature = String.valueOf(temp.get("Feature"));
            pr.addToy(new Doll(name, feature));
        }
        for (int i = 0; i < fondsize*rWeight; i++) {
            JSONObject temp = (JSONObject) robotArr.get(i);
            String name = String.valueOf(temp.get("Name"));
            String feature = String.valueOf(temp.get("Feature"));
            pr.addToy(new Robot(name, feature));
        }
        for (int i = 0; i < fondsize*cWeight; i++) {
            JSONObject temp = (JSONObject) carArr.get(i);
            String name = String.valueOf(temp.get("Name"));
            String feature = String.valueOf(temp.get("Feature"));
            pr.addToy(new Car(name, feature));
        }
        Collections.shuffle(pr.toys);
//        System.out.println(pr.showFond());
        return pr;
    }

    public void draw(Prizes p){
        System.out.println("You have three attempts!");
        int att = 3;
        String answ = "yes";
        while(answ.equals("yes") && att > 0) {
            System.out.print("\nContinue? Answer yes or no: ");
            Scanner scan = new Scanner(System.in);
            answ = scan.next().toLowerCase();
//            System.out.printf("--%s--", answ);
            while (!answ.equals("yes") && !answ.equals("no")) {
                System.out.print("Answer yes or no: ");
                answ = scan.next().toLowerCase();
            }
            if (answ.equals("yes")){
                System.out.println("\nCongratulations! Your prize is: ");
                System.out.println(p.toys.get(0).toString());
                p.delToy(0);
                att--;
            }
            System.out.printf("\n%d attempts left!", att);
        }
        System.out.println("\nYou will be returned to main menu.");
    }
}
