import java.util.Scanner;

public class NaturalNumberSum {

    // Recursive method to find sum of n natural numbers
    public static int sumUsingRecursion(int n) {
        //base case
        if (n == 1) {
            return 1;
        }
        //recursive call
        return n + sumUsingRecursion(n - 1);
    }

    // Formula-based method to find sum of n natural numbers
    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        //check if 
        if (n <= 0) {
            System.out.println("Invalid input! Please enter a natural number (>0).");
            return;
        }

        // Calculate sum using recursion
        int sum1 = sumUsingRecursion(n);

        // Calculate sum using formula
        int sum2 = sumUsingFormula(n);

        // Display results
        System.out.println("Sum " + n + " using recursion: " + sum1);
        System.out.println("Sum " + n + " using formula: " + sum2);

        // Check if both results are the same
        if (sum1 == sum2) {
            System.out.println("MATCH! The result is correct.");
        } 
        else {
            System.out.println("DIFFERENT! Please check the methods.");
        }
    }
} 
