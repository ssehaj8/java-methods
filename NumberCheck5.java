import java.util.Scanner;

public class NumberCheck5 {

    	// Method to find factors of a number and return them as an array
    	public static int[] findFactors(int n) {
        	int count = 0;
        	for (int i = 1; i <= n; i++) {
            		if (n % i == 0) {
                		count++;
            		}
        	}

        	int[] factors = new int[count];
        	int index = 0;
        	for (int i = 1; i <= n; i++) {
            		if (n % i == 0) {
                		factors[index++] = i;
            		}
        	}
        	return factors;
    	}

   	// Method to find the greatest factor of a number
    	public static int findGreatestFactor(int[] factors) {
        	int greatest = factors[0];
        	for (int i=0;i<factors.length; i++) {
            		if (factors[i] > greatest) {
                		greatest = factors[i];
            		}
        	}
        	return greatest;
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
    	public static int productOfFactors(int[] factors) {
        	int product = 1;
        	for (int i=0;i<factors.length; i++) {
            		product *= factors[i];
        	}
        	return product;
    	}

    	// Method to find the product of the cubes of the factors
    	public static double productOfCubes(int[] factors) {
        	double product = 1;
        	for (int i=0;i<factors.length; i++) {
            		product *= Math.pow(factors[i], 3);
        	}
        	return product;
    	}

    	// Method to check if a number is a perfect number
    	public static boolean isPerfectNumber(int n) {
        	int[] factors = findFactors(n);
        	int sum = 0;
        	for (int i=0;i<factors.length; i++) {
            		if (factors[i] != n) {
                		sum += factors[i];
            		}
        	}
        	return sum == n;
    	}

    	// Method to check if a number is an abundant number
    	public static boolean isAbundantNumber(int n) {
        	int[] factors = findFactors(n);
        	int sum = 0;
        	for (int i=0;i<factors.length; i++) {
            		if (factors[i] != n) {
                		sum += factors[i];
            		}
        	}
        	return sum > n;
    	}

    	// Method to check if a number is a deficient number
    	public static boolean isDeficientNumber(int n) {
        	int[] factors = findFactors(n);
        	int sum = 0;
        	for (int i=0;i<factors.length; i++) {
            		if (factors[i] != n) {
                		sum += factors[i];
            		}
        	}
        	return sum < n;
    	}

    	// Method to calculate the factorial of a digit
    	public static int factorial(int n) {
        	int fact = 1;
        	for (int i = 1; i <= n; i++) {
            		fact *= i;
        	}
        	return fact;
    	}	

    	// Method to check if a number is a strong number
    	public static boolean isStrongNumber(int n) {
        	int original = n;
        	int sum = 0;
        	while (n > 0) {
            		int digit = n % 10;
            		sum += factorial(digit);
            		n /= 10;
        	}
        	return sum == original;
    	}

    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
        	System.out.print("Enter a number: ");
        	int n = sc.nextInt();

        	int[] factors = findFactors(n);
        	System.out.println("Factors: ");
        	for (int i=0;i<factors.length; i++) {
            		System.out.print(factors[i] + " ");
        	}
        	System.out.println();

        	System.out.println("Greatest Factor: " + findGreatestFactor(factors));
        	System.out.println("Sum of Factors: " + sumOfFactors(factors));
        	System.out.println("Product of Factors: " + productOfFactors(factors));
        	System.out.println("Product of Cubes of Factors: " + productOfCubes(factors));

        	System.out.println(n + " is Perfect Number? : " + isPerfectNumber(n));
        	System.out.println(n + " is Abundant Number? : " + isAbundantNumber(n));
        	System.out.println(n + " is Deficient Number? : " + isDeficientNumber(n));
        	System.out.println(n + " is Strong Number? : " + isStrongNumber(n));
	}
}
