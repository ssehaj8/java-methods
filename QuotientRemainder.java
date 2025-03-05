import java.util.Scanner;

public class QuotientRemainder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for two numbers
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();

        // Get the quotient and remainder
        int[] result = findRemainderAndQuotient(number, divisor);

        // Display the result
        System.out.printf("Quotient: %d, Remainder: %d%n", result[0], result[1]);
    }

    // Method to find the quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2];
        // Calculate quotient
        result[0] = number / divisor;

        // Calculate remainder
        result[1] = number % divisor;

	//return result array containing smallest and largest numbers
        return result;
    }
} 
