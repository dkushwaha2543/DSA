package Questions.Day7;

import java.util.Scanner;

public class FutureValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter the Present value :");
        double pv=sc.nextDouble();
        System.out.print(" Enter the Rate of return :");
        double r =sc.nextDouble();
        System.out.print(" Enter the number of years :");
        double year=sc.nextInt();
        // formula is=present value*(1+rate of return)^number of years
        double fv=pv* Math.pow(1+r,year);
        System.out.println(" your future value is :"+fv);
    }
}
