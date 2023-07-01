import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keycoard = new Scanner(System.in);

        BankAccount ericsChecking = new BankAccount();

        ericsChecking.setOwnersName("Eric");
        ericsChecking.setBalance(1_000_000);
        ericsChecking.setInterestRate(.02);

        BankAccount ericsSavings = new BankAccount();

        ericsSavings.setOwnersName("Eric");
        ericsSavings.setBalance(500);
        ericsSavings.setInterestRate(.04);

        BankAccount ericsDisneyFund = new BankAccount("Eric", 1000, 1);

        printBankAccountDetails(ericsDisneyFund);

        if (ericsDisneyFund.getOwnersName().equalsIgnoreCase("Eric")){
            System.out.println("this is erics disney fund");

        }

        printBankAccountDetails(ericsChecking);
        printBankAccountDetails(ericsSavings);

        System.out.println("Which account do you want to withdraw from?");
        String account = keycoard.nextLine();

        if (account.equalsIgnoreCase("Checking")){
            withdrawFromAcount(ericsChecking);
        }else if (account.equalsIgnoreCase("Savings")){
            withdrawFromAcount(ericsSavings);
        } else if (account.equalsIgnoreCase("Disney Fund")) {
            withdrawFromAcount(ericsDisneyFund);
        }else {
            System.out.println("Invalid Account type");
        }

        System.out.println("Which account do you want to deposit to?");
        account = keycoard.nextLine();
        System.out.println("New account balance is $ " + account);


        if (account.equalsIgnoreCase("Checking")){
            depositToAccount(ericsChecking);
        }else if (account.equalsIgnoreCase("Savings")){
            depositToAccount(ericsSavings);
        } else if (account.equalsIgnoreCase("Disney Fund")) {
            depositToAccount(ericsDisneyFund);
        }else {
            System.out.println("Invalid Account type");
        }

    }
    public static void depositToAccount (BankAccount account){
        Scanner keycoard = new Scanner(System.in);
        double deposit = Double.parseDouble(keycoard.nextLine());
        account.deposit(deposit);

    }

    public static void withdrawFromAcount( BankAccount account){
        Scanner keycoard = new Scanner(System.in);

        System.out.println("How much do you want to withdraw?");
        double amount = Double.parseDouble(keycoard.nextLine());
        while (!account.withdraw(amount)){
            System.out.println("Unable to withdraw amount");
            System.out.println("Your balance is $ " + account.getBalance());
            System.out.println("How much do you want to withdraw?");
            amount = Double.parseDouble(keycoard.nextLine());
        }
        System.out.println("Withdraw successful!");
        System.out.println("Your new balance is $ " + account.getBalance());

    }

    public static void printBankAccountDetails ( BankAccount account){

        System.out.println("Your account owners name is " + account.getOwnersName());
        System.out.println("Your account balance is " + account.getBalance());
            System.out.println("Your account interest rate is " + account.getInterestRate());
    }
}