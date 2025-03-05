import java.util.Scanner;

public class ChocolateDistribution {

	// Method to find the chocolates per child (quotient) and remaining chocolates (remainder)
    	public static int[] findRemainderAndQuotient(int number, int divisor) {
        	int[] result = new int[2];

        	//Calculate Quotient
        	result[0] = number / divisor;

        	//Calculate Remaineder
        	result[1] = number % divisor;

        	//return the result array containing chocolates/child and remaining chocolate
        	return result;
    	}

    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	// Take user input for number of chocolates and number of children
        	System.out.print("Enter the number of chocolates: ");
        	int n = sc.nextInt();

        	System.out.print("Enter the number of children: ");
        	int m = sc.nextInt();

        	// Calculate chocolates per child and remaining chocolates
        	int[] result = findRemainderAndQuotient(n, m);

        	// Display the results
        	System.out.println("Chocolates per child: " + result[0]);
        	System.out.println("Remaining chocolates: " + result[1]);
    	}
}
