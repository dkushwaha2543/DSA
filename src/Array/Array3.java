package Array;

import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        int r,c;
        Scanner sc= new Scanner(System.in) ;

        System.out.println("enter the number of Row ");
        r=sc.nextInt();
        System.out.println("Enter the number of column");
        c=sc.nextInt();
        int[][]arr=new int[r][c] ;
        System.out.println(" Enter the array elements ");
        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();

            }
        }
            System.out.println("Entered elemente are");
            for (int i=0;i<arr.length;i++){
                for (int j=0;j<arr[i].length;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }

    }

