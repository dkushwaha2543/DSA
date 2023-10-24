package Questions.Day2;

import java.util.Scanner;

public class Solutoin {
    public static void main(String[] args) {
      // Question 1 Area of circle
       Scanner sc=new Scanner(System.in);
     /* int r=sc.nextInt();
      //double A;
        area(r);
    }
    static void area(int r){
       double  A =(r*r)*Math.PI;
        System.out.print(" Area of the circle "+ A );*/

        // Question 2 Area of triangle
      /*  System.out.println("Enter the height ");
        int height = sc.nextInt();
        System.out.println("Ent3er the base ");
        int base = sc.nextInt();
        AreaOfTriangle(height,base);
    }
    static void AreaOfTriangle( int height,int base){
        double area=(height*base)/2;
        System.out.print(" The area of Triangle "+ area);*/

      /*  // Question 3 Area of Rectangle program
        System.out.println(" Enter the length ");
        int length =sc.nextInt();
        System.out.println(" Enter the width ");
        int width = sc.nextInt();
        areaOfRectangle(length,width);
    }
    static void areaOfRectangle(int length,int width){
        double area= length*width;
        System.out.print(" Area of rectangle "+ area);*/

        // Question 4 Area of Isosceles triangle
        System.out.println(" Enter the Base ");
        int base= sc.nextInt();
        System.out.println(" Enter the Height ");
        int height=sc.nextInt();
        isoscelesTriangle(base,height);
    }
    static void isoscelesTriangle(int base,int height){
        double area=(base*height)/2;
        System.out.print(" thr area of isosceles triangle "+ area);
    }
}
