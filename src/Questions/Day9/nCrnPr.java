package Questions.Day9;

import java.util.Scanner;

public class nCrnPr {
    // Import the Scanner class
//import java.util.Scanner;

    // Create a class named NCR_NPR

        // Create a static method to calculate the factorial of a number
        public static long factorial(int n) {
            // Declare a variable to store the result
            long result = 1;

            // Use a for loop to multiply the result by each number from 1 to n
            for (int i = 1; i <= n; i++) {
                result = result * i;
            }

            // Return the result
            return result;
        }

        // Create a main method
        public static void main(String[] args) {

            // Create a Scanner object
            Scanner input = new Scanner(System.in);

            // Declare variables to store the numbers n and r
            int n, r;

            //  the user to enter the value of n
            System.out.print("Enter the value of n: ");
            n = input.nextInt();

            //  the user to enter the value of r
            System.out.print("Enter the value of r: ");
            r = input.nextInt();

            // Check if n and r are valid
            if (n < 0 || r < 0 || n < r) {
                // Display an error message and exit the program
                System.out.println("Error: Invalid input.");
                return;
            }

            // Declare variables to store the values of nCr and nPr
            long nCr, nPr;

            // Use the factorial formula to calculate nCr and nPr
            nCr = factorial(n) / (factorial(r) * factorial(n - r));
            nPr = factorial(n) / factorial(n - r);

            // Display the results
            System.out.println("nCr = " + nCr);
            System.out.println("nPr = " + nPr);
        }
    }

