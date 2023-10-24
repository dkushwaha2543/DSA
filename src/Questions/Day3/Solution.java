package Questions.Day3;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        // Question 1 Perimeter of Rectangle
      /*  System.out.println(" Enter the length ");
        int length= sc.nextInt();
        System.out.println(" Enter the Width ");
        int width=sc.nextInt();
        rectangle(length,width);

    }
    static void rectangle(int length,int width){
        double p=2*(length+width);
        System.out.print(" Perimeter of Rectangle is :" + p);*/

        //Question 2 perimeter of Square
/*        System.out.println("Enter the Side  ");
        int a= sc.nextInt();
        square(a);
    }
    static void square(int a){
        int p=4*a;
        System.out.println(" perimeter of square :" + p);*/

        // Question 3 perimeter of rhombus
        // Same as Question 2

        //Question 4 volume of cone
       /* System.out.println(" Enter the radius ");
        int r=sc.nextInt();
        cone(r);
    }
    static void cone(int r){
        double volOfcone=2*Math.PI*r;
        System.out.println(" The volume of cone is :"+ volOfcone);*/

        // Question 5 Volume of prism
     /*   System.out.println(" Enter the base area of prism");
        double b=sc.nextDouble();
        System.out.println(" Enter the height of the prism");
        double h=sc.nextDouble();
        volOfPrism(b,h);
    }
    static void volOfPrism(double b,double h){
        double v=b*h;
        System.out.println(" The Volume of prism :"+ v);*/

        // Question 6 Volume of Cylinder
//        System.out.println(" Enter the Radius of cylinder  ");
//        double r=sc.nextDouble();
//        System.out.println(" Enter the Height of cylinder ");
//        double h=sc.nextDouble();
//        voOfCylinder(r,h);
//
//    }
//    static double voOfCylinder(double r,double h){
//        double v=Math.PI*(r*r)*h;
//        System.out.println(" The volume of cylinder is ;"+ v);
//      return v;

        // Question 7 Volume of sphere
       /* System.out.println(" Enter the Radius of sphere");
        double r=sc.nextDouble();
        volOfsphere(r);
    }
    static double volOfsphere(double r){
        double v= 4*Math.PI*(r*r*r)/3;
        System.out.println(" The volume  of sphere :" + v);
        return v;*/

        // Question 8 volume of pyramid
        System.out.println(" Enter the base length");
        double l=sc.nextDouble();
        System.out.println("Enter the width ");
        double w=sc.nextDouble();
        System.out.println(" Enter the pyramid of height ");
        double h=sc.nextDouble();
        volOfpyramid(l,w,h);
    }
    static void volOfpyramid(double l,double w,double h){
        double v=l*w*h/3;
        System.out.println(" The volume of pyramid :"+ v);

    }

}
