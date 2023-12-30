package Array;
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int r;
       int c;
        System.out.println(" Enter the number of Row");
       r=sc.nextInt();
        System.out.println("Enter the number column");
       c=sc.nextInt();
       int[][]arr=new int[r][c];
        System.out.println(" Enter the elements of array ");
         for(int i=0;i<r;i++) {
             for (int j = 0; j < c; j++) {
                 arr[i][j] = sc.nextInt();

             }
         }
        System.out.println(" Elements of the array");

                 for (int i = 0; i < r; i++) {
                     for (int j = 0; j < c; j++) {
                         System.out.print(arr[i][j] + " ");
                     }
                     System.out.println();
                 }

             }
         }
