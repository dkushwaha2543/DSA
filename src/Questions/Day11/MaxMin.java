package Questions.Day11;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the first number ");
        int num1=sc.nextInt();
        System.out.println(" Enter the second number ");
        int num2=sc.nextInt();
        System.out.println("Enter the third number ");
        int num3=sc.nextInt();
        maxMin(num1,num2,num3);
    }
    public static void maxMin(int num1,int num2,int num3){
        if (num1>num2 && num1>num3){
            System.out.println("The num1 is largest :"+num1);
        }
        if (num2>num1 && num2>num3){
            System.out.println(" The num2 is largest :"+num2);
        }
        if(num3>num1 && num3>num2){
            System.out.println(" The num3 is largest :"+num3);
        }else {
            System.out.println(" Number not found ");
        }
    }
}
