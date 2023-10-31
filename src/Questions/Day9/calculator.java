package Questions.Day9;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" enter the first number");
        double num1= sc.nextDouble();
        System.out.println(" Enter the second number ");
        double num2= sc.nextDouble();
        System.out.println(" Enter the operator(+,-,*,/) ");
        char operator=sc.next().charAt(0);
        double result;
        // Using switch case because diff operations based on diff operator
        switch(operator){
            // case 1 for addition
            case '+':
                result=num1+num2;
                break;
                // case 2 subtraction
            case'-':
                result=num1-num2;
                break;
                // case 3 multiplication
            case '*':
                result=num1*num2;
                break;
                // case 4 division
            case'/':
                if (num2==0){
                    System.out.println(" Cannot divide by zero");
                    return;
                }else {
                    result=num1/num2;
                    break;
                }
            default:
                System.out.println(" Error Invalid operator ");
                return;
        }
        System.out.println(num1+" "+operator+" "+num2+"="+result);
    }
}
