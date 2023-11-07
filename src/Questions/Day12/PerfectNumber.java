package Questions.Day12;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number to check perfect or not " );
        int num=sc.nextInt();
        //int sum =0;
        perfectNumber(num);

    }
    public static void perfectNumber(int num){
        int sum=0;
        int i=1;
        while (i<=num/2){
            if (num%i == 0) {
                sum=sum+i;
            }
            i++;
        }
        if (sum==num){
            System.out.println(num + " is perfect number ");
        }else {
            System.out.println(num + " not perfect number ");
        }

    }
}
