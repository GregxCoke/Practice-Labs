public class BankAccount {

    String ownersName;
    double balance;
    double interestRate;


    public BankAccount(){

        ownersName = "";
        balance = 0;
        interestRate = 0;

    }
    public BankAccount(String ownersName, double balance, double interestRate){

        this.ownersName = ownersName;
    }


}
