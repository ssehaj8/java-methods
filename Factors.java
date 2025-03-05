import java.util.Scanner;

public class Factors {

	// Method to find the factors of a number and return them in an array
    	public static int[] findFactors(int n) {
        	int count = 0;

        	// First loop to count the number of factors
        	for (int i = 1; i <= n; i++) {
            		if (n % i == 0) {
                	count++;
            		}
        	}

        	// Create an array to store the factors
        	int[] factors = new int[count];
        	int index = 0;

        	// save the factors into the array
        	for (int i = 1; i <= n; i++) {
            		if (n % i == 0) {
                		factors[index++] = i;
            		}
		}
        	return factors;
	}

    	// Method to find the sum of the factors
    	public static int sumOfFactors(int[] factors) {
        	int sum = 0;
        	for (int i=0;i<factors.length; i++) {
        		sum += factors[i];
        	}
        	return sum;
    	}

    	// Method to find the product of the factors
    	public static long productOfFactors(int[] factors) {
        	long product = 1;
        	for (int i=0;i<factors.length; i++) {
            		product *= factors[i];
        	}
        	return product;
    	}

    	// Method to find the sum of squares of the factors
    	public static int sumOfSquaresOfFactors(int[] factors) {
        	int sumOfSquares = 0;
        	for (int i=0;i<factors.length; i++) {
            		sumOfSquares += Math.pow(factors[i], 2);
        	}
        	return sumOfSquares;
    	}

    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	// Take user input for the number
        	System.out.print("Enter a number: ");
        	int n = sc.nextInt();

        	// Find the factors
        	int[] factors = findFactors(n);

        	// Print the factors
        	System.out.print("Factors of " + n + ": ");
        	for (int i=0;i<factors.length;i++) {
            		System.out.print(factors[i] + " ");
        	}
        	System.out.println();

        	// Calculate and display the sum, product, and sum of squares of the factors
        	System.out.println("Sum of factors: " + sumOfFactors(factors));
        	System.out.println("Product of factors: " + productOfFactors(factors));
        	System.out.println("Sum of squares of factors: " + sumOfSquaresOfFactors(factors));
    	}
} 
