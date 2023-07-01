import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);

        BankAccount ericsChecking = new BankAccount();

        ericsChecking.ownersName = "Eric";
        ericsChecking.balance = 1_000_000;
        ericsChecking.interestRate = .02;

        BankAccount ericsSavings = new BankAccount();

        ericsSavings.ownersName = "Eric";
        ericsSavings.balance = 10000000;
        ericsSavings.interestRate = .02;

        System.out.println("The account owners name is " + ericsChecking.ownersName);
        System.out.println("The account balance is " + ericsChecking.balance);
        System.out.println("The interest rate is "+ ericsChecking.interestRate);

        System.out.println("The account owners name is " + ericsSavings.ownersName);
        System.out.println("The account balance is " + ericsSavings.balance);
        System.out.println("The interest rate is "+ ericsSavings.interestRate);


        public static void printBankAccountDetails ( BankAccount account){


        }
    }


}