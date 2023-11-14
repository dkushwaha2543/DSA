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
        if (amount<=balance){
            balance=balance-amount;
        }
        else {
            System.err.println(" Your balance is less then amount "+balance);
        }
    }
    // Account holder name
    public void AccHoldrName(){
        System.out.println("Account holder name is Deepak Kushwaha");
    }
    //Get Balance
    public double getBalance() {
        return balance;
    }
}