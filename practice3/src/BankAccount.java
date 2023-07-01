public class BankAccount {

    private String ownersName;
    private double balance;
    private double interestRate;

    // Constructor is a special method made to 'create' the object
    //No return type specified
    //No static keyword
    //  same name of class

    public BankAccount (){

        ownersName = "";
        balance = 0;
        interestRate=0;

    }
    public BankAccount (String ownersName, double balance, double interestRate){

        this.ownersName = ownersName;
        this.balance = balance;
        setInterestRate(interestRate);
    }
    public String getOwnersName(){

        return ownersName;
    }
    public String setOwnersName(String ownersName){
        this.ownersName = ownersName;
        return ownersName;
    }

    public double getBalance() {

        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0 ){
            this.balance = 0;
        } else{
            this.balance = balance;
        }
    }

    public double getInterestRate() {

        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
        if (interestRate < 0 ){
            this.interestRate = 0;
        } else if ( interestRate >= 1){
            this.interestRate = interestRate / 100;
        } else{
            this.interestRate = interestRate;
        }
    }
    public void deposit (double amountToDeposit){
        if(amountToDeposit > 0 ){
            balance += amountToDeposit;
        }

    }
    public boolean withdraw (double amountToWithdraw){
        if (amountToWithdraw > balance ){
            return false;
        }else{
            balance -= amountToWithdraw;
            return true;
        }

    }
}
