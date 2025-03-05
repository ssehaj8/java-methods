import java.util.Scanner;

public class NumberCheck4 {

    	// Method to check if a number is prime
    	public static boolean isPrime(int n) {
        	if (n <= 1) return false;
        	for (int i = 2; i <= Math.sqrt(n); i++) {
            		if (n % i == 0) return false;
        	}
        	return true;
    	}

    	// Method to check if a number is a neon number
    	public static boolean isNeon(int n) {
        	int square = n * n;
        	int sum = 0;
        	while (square != 0) {
            		sum += square % 10;
            		square /= 10;
        	}
        	return sum == n;
    	}

    	// Method to check if a number is a spy number
    	public static boolean isSpy(int n) {
        	int sum = 0, product = 1;
        	while (n != 0) {
            		int digit = n % 10;
            		sum += digit;
            		product *= digit;
            		n /= 10;
        	}
        	return sum == product;
    	}

    	// Method to check if a number is an automorphic number
    	public static boolean isAutomorphic(int n) {
        	int square = n * n;
        	String str = String.valueOf(n);
        	//String conversion of square
        	String str2 = String.valueOf(square);
        	return str2.endsWith(str);
    	}

    	// Method to check if a number is a buzz number
    	public static boolean isBuzz(int n) {
        	return n % 7 == 0 || n % 10 == 7;
    	}

	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter a number: ");
        	int n = sc.nextInt();

        	System.out.println(n + " is prime: " + isPrime(n));
        	System.out.println(n + " is neon: " + isNeon(n));
        	System.out.println(n + " is spy: " + isSpy(n));
        	System.out.println(n + " is automorphic: " + isAutomorphic(n));
        	System.out.println(n + " is buzz: " + isBuzz(n));
	}
}
