import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double pennies = .01;
        double nickels = .05;
        double dimes = .10;
        double quarters = .25;
        double total = 0;

        System.out.println("How many pennies do you have?");
        double amountOfPennies = keyboard.nextDouble();

        System.out.println("How many nickles do you have?");
        double amountOfNickels = keyboard.nextDouble();

        System.out.println("How many dimes do you have?");
        double amountOfDimes = keyboard.nextDouble();

        System.out.println("How many quarters do you have?");
        double amountOfQuarters = keyboard.nextDouble();

        total = pennies * amountOfPennies + nickels * amountOfNickels + dimes * amountOfDimes + quarters * amountOfQuarters;
        System.out.println("The total value of your change is " + total);




    }
}