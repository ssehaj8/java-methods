import java.util.Scanner;

public class PositiveNegative {

	// Method to check whether a number is positive or negative
    	public static boolean isPositive(int n) {
        	return n >= 0;
    	}

    	// Method to check whether a number is even or odd
    	public static boolean isEven(int n) {
        	return n % 2 == 0;
    	}

    	// Method to compare two numbers
    	public static int compare(int n1, int n2) {
        	if (n1 > n2) return 1;
        	if (n1 < n2) return -1;
        	return 0;
    	}

    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
        	int[] arr = new int[5];

        	// Taking input for 5 numbers
        	System.out.println("Enter 5 numbers:");
        	for (int i = 0; i < arr.length; i++) {
            		arr[i] = sc.nextInt();
        	}

        	// Checking if each number is positive or negative and if positive, check if even or odd
        	for (int i = 0; i < arr.length; i++) {
            		if(isPositive(arr[i])) {
                		System.out.print(arr[i] + " is positive and ");
                		if(isEven(arr[i])) {
                    			System.out.println("even.");
                		} 
                		else {
                    			System.out.println("odd.");
                		}
            		} 
            		else {
                		System.out.println(arr[i] + " is negative.");
            		}
        	}

        	// Comparing the first and last elements of the array
        	int result = compare(arr[0], arr[arr.length - 1]);
        	if (result > 0) {
            		System.out.println("The first number is greater than the last number.");
        	} 
        	else if (result < 0) {
            		System.out.println("The first number is less than the last number.");
        	} 
        	else {
            		System.out.println("The first and last numbers are equal.");
        	}
    	}
}

