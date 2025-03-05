import java.util.Scanner;

public class NaturalNumberSum {
    // Method to calculate the sum of the first n natural numbers
    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for the number of natural numbers
        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            int sum = calculateSum(n);
            System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        }
    }

} 
