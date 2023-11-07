package Questions.Day11;

import java.util.Scanner;

public class EligibleForVote {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter the age :");
        int age=sc.nextInt();
        eligibleForVote(age);
    }
    public static void eligibleForVote(int age){
        if(age>=18){
            System.out.println("Yas he/her can vote ");
        }else {
            System.out.println("No he/her can't vote ");
        }
    }
}
