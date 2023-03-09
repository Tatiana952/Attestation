import Toys.Car;
import Toys.Doll;
import Toys.Robot;

import java.util.Scanner;

public class gameUI {

    public void hello(){
        System.out.println("Hello! This is a game 'Toy Drawings'.\n");
    }

    public void bye(){
        System.out.println("Bye! Have a nice day!\n");
    }

    public int getMode(){
        System.out.println("\nChoose mode:");
        System.out.println("1. Start draw\n2. Change toy drop rate\n" +
                "3. Stop draw\n");
        Scanner scan = new Scanner(System.in);
        int mode = -1;
        System.out.print("Mode: ");
        while (mode > 3 || mode < 1){
            while (!scan.hasNextInt()) {
                System.out.print("Letters unacceptable. Mode: ");
                scan.next();
            }
//            System.out.print("Enter correct number. Mode: ");
            mode = scan.nextInt();
        }
        return mode;
    }

    public String suc(){
        return "\nSuccess!";
    }

    public String showRates(Doll o1, Robot o2, Car o3){
        return String.format("drop rates\n1. doll: %s%%\n2. robot: %s%%\n3. car: %s%%",
                o1.getFreq()*100, o2.getFreq()*100, o3.getFreq()*100);
    }

    public int getAttempts(){
        Scanner scan = new Scanner(System.in);
        int att = -1;
        System.out.print("Enter number of attempts (10-15 times): ");
        while (att > 15 || att < 10){
            while (!scan.hasNextInt()) {
                System.out.print("Letters unacceptable. Attempts: ");
                scan.next();
            }
            System.out.print("Enter correct number. Mode: ");
            att = scan.nextInt();
        }
        return att;
    }
}
