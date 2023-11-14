package OopsQuestions;

public class BankMain {
    public static void main(String[] args) {

        Account cust1=new Account();// Create an account object
        // For customer 1
        cust1.deposit(20);
        // customer 2
        Account cust2=new Account();
        cust2.deposit(10);
        System.out.println(cust1.getBalance());
        System.out.println(cust2.getBalance());
        cust1.withdraw(50);
        System.out.println(cust1.getBalance());
    }
}
