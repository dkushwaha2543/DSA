package Questions.Day5;
//Take integer inputs till the user enters O
// and print the largest number from all.
import java.util.Scanner;
public class LargestInteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int max=0;
       int n=1;
       while (n!=0){
           n=sc.nextInt();
           if (n>max){
               max=n;
           }
           if (n==0){
               System.out.println("The largest number is :"+max);
               break;
           }
       }

    }
}
