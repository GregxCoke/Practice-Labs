public class Main {
    public static void main(String[] args) {

        // Random dice roll generator 

        int die1=0;
        int die2=0;
        int total=0;

        die1 = (int)(Math.random()*6)+1;
        die2 = (int)(Math.random()*6)+1;
        total = die1 + die2;

        System.out.println("1st dice rolled " + die1);
        System.out.println("2nd dice rolled " + die2);
        System.out.println("The total of both dice is " + total);




        }



}
