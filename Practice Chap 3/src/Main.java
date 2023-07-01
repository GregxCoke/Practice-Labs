import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String line;
        System.out.println("Enter a line of text.");
        line = keyboard.nextLine();
        System.out.println();
        System.out.print("Capitalized Verison: ");
        printCapitalized(line);
    }

    static void printCapitalized(String str) {
        char ch = 0;
        char prevCh;
        int i;
        prevCh = '.';
        for ( i = 0; i < str.length(); i++) {
            System.out.print( Character.toUpperCase(ch));
            ch = str.charAt(i);
            if ( Character.isLetter(ch) && ! Character.isLetter(prevCh) )
                System.out.println( Character.toUpperCase(ch));
            else
                System.out.println( ch );
            prevCh = ch;
        }
        System.out.println();
    }
}