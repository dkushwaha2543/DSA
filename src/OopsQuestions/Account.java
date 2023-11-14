package OopsQuestions;
public class Account {
    private double balance;
    public Account(){
        balance=100;
    }
    //Deposit
    public void deposit(double amount){
        balance=balance+amount;
    }
    // Withdraw
    public void withdraw(double amount){
        balance=balance-amount;
    }
    //Get Balance
    public double getBalance() {
        return balance;
    }
}