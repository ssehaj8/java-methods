import java.util.Scanner;

public class SmallestLargest {
	// Method to find the smallest and largest of three numbers
    	public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        	int smallest = Math.min(number1, Math.min(number2, number3));
        	int largest = Math.max(number1, Math.max(number2, number3));
        	
		//return the array that stores the smallest and largest numbers
        	return new int[]{smallest, largest};
    	}

    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	// Take user input for three numbers
        	System.out.print("Enter first number: ");
        	int n1 = sc.nextInt();

        	System.out.print("Enter second number: ");
        	int n2 = sc.nextInt();

        	System.out.print("Enter third number: ");
        	int n3 = sc.nextInt();

        	// Find smallest and largest
        	int[] result = findSmallestAndLargest(n1, n2, n3);

        	// Display the result
        	System.out.println("Smallest number: " + result[0]);
        	System.out.println("Largest number: " + result[1]);
    	}
} 
