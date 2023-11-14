package Questions.Day14;
// Sum of array element
import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element you want");
        int r=sc.nextInt();
       // System.out.println("Enter the number of element you want");
        int[]arr= new int[r];
        for (int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Element of Array");
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println("Sum of array");
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
