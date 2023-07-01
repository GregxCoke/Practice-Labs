import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int eggs;
        int dozen;
        int extra;

        System.out.println("How many eggs do you have?");
        eggs = keyboard.nextInt();

        dozen = eggs / 12;
        extra = eggs % 12;

        System.out.println("You have " + dozen + " dozen eggs with " + extra + " eggs left over!.");

    }
}