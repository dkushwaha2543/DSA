package Questions.Day5;
// Take integer inputs till the user enters
//O and print the sum of all numbers
//(HINT: while loop)
import java.util.Scanner;

public class SumOfAllIntegers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
   int n=1;
    int sum=0;
    while (n!=0){
        n=sc.nextInt();
        sum+=n;
        if (n==0){
            System.out.println("Sum of all integers :"+ sum);
            break;
        }

    }

    }
}
