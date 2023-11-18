package Questions.Day15;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        int balance=5000,withdraw,deposit;
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("Automated Taller Machine");
            System.out.println("1, Withdraw ");
            System.out.println("2, Deposit ");
            System.out.println("3, Check balance ");
            System.out.println("4, Exit ");
            System.out.print(" Choose the operation you want to perform: ");
            // get choice from user
            int choice=sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print(" Enter money to be withdraw ");
                    // get the money withdraw form user
                    withdraw = sc.nextInt();
                    if (balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.print(" Please collect your money " + balance);
                    } else {
                        System.out.print("Insufficient Balance ");
                    }
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.print(" Enter money to be deposit ");
                    // get the money deposit from user
                    deposit = sc.nextInt();
                    // Add the deposit amount to the total balance
                    balance = balance + deposit;
                    System.out.println("Your money has been successfully deposit " + balance);
                    System.out.println(" ");
                    break;
                case 3:
                    //Deposit the total balance of the user
                    System.out.println(" Balance : " + balance);
                    System.out.println(" ");
                    break;
                case 4:
                    // Exit from the manu
                    System.exit(0);
                default:
                    //default statement
                    System.out.println(" Invalid choice ");
            }
        }
    }
}
