package String;

import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        String [][] arr=new String[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.next();
            }
        }
            System.out.println(" Entered Strings are  ");
            for (int i= 0;i<3;i++){
                for(int j=0;j<3;j++){
                    System.out.print(arr[i][j]+" ");
            }
                System.out.println();
        }
    }
}
