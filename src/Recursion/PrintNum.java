package Recursion;

public class PrintNum {
    public static void main(String[] args) {
        // write a function that takes in a number and print it
        // print first 5 number
        // Using Recursion
       /* if you are calling a function again and again, you can treat it as a separate
       call in the stack
        */
        print(1);
    }
    static void print(int n){
        if(n==5){ // Break condition
            System.out.print(5);
            return;
        }
        System.out.print(n + " ");
        print(n+1);
    }
}
