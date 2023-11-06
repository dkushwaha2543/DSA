package Questions.Day11;

import java.util.Scanner;
// Given number is even or odd
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the number to find out Even or Odd ");
        int a=sc.nextInt();
        evenOdd(a);
    }
    public static void evenOdd(int a){
        if(a%2==0){
            System.out.println(" The number is Even :"+ a);
        }else {
            System.out.println(" The number is Odd :"+ a);
        }
    }
}
