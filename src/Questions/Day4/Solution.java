package Questions.Day4;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Question 1 Curved surface area of cylinder
       Scanner sc=new Scanner(System.in);
       /* System.out.println("  Enter the Radius of Cylinder ");
        double r= sc.nextDouble();
        System.out.println(" Enter the height of the cylinder ");
        double h=sc.nextDouble();
        csaOfCyliner(r,h);
    }
    public static void csaOfCyliner(double r,double h){
        double CSA=2*Math.PI*r*h;
        System.out.println(" The Curved Surface Area of cylinder :"+ CSA);*/

        // Question 2 fibonacci Series
       /* int n1=0;
        int n2=1;
        int n=10;
        System.out.print(n1+" "+n2);//printing 0 and 1

        for(int i=2;i<n;i++)//loop starts from 2 because 0 and 1 are already printed
        {
           int n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }*/
        // Question 4 factor of number
        System.out.println(" Enter the number ");
        int n=sc.nextInt();
        factor(n);
    }
    public static void factor(int n){
        for (int i=1;i<=n;i++){
            if (n%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
