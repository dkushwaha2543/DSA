package Questions.Day14;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number ");
        int num= sc.nextInt();
        int result=factorial(num);
        System.out.println(" Factorial of number " + result);
    }
    public static int factorial(int num){// Using Recursion
        if(num==0){
            return 1;
        }else {
            return num*factorial(num-1);
        }
    }
}
