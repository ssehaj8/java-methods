import java.util.Arrays;
import java.util.Scanner;

public class NumberCheck3 {
	// Method to find the count of digits in the number
    	public static int countDigits(int n) {
        	return String.valueOf(n).length();
    	}

    	// Method to store the digits of the number in an array
    	public static int[] getDigits(int n) {
        	String str = String.valueOf(n);
        	int[] digits = new int[str.length()];
        	for (int i = 0; i < str.length(); i++) {
            		digits[i] = Character.getNumericValue(str.charAt(i));
        	}
        	return digits;
    	}

    	// Method to reverse the digits array
    	public static int[] reverseArray(int[] arr) {
        	int[] reversed = new int[arr.length];
        	for (int i = 0; i < arr.length; i++) {
            		reversed[i] = arr[arr.length - 1 - i];
        	}
        	return reversed;
    	}

    	// Method to compare two arrays and check if they are equal
    	public static boolean arraysEqual(int[] arr1, int[] arr2) {
        	return Arrays.equals(arr1, arr2);
    	}

    	// Method to check if a number is a palindrome
    	public static boolean isPalindrome(int n) {
        	int[] digits = getDigits(n);
        	int[] reversed = reverseArray(digits);
        	return arraysEqual(digits, reversed);
    	}

    	// Method to check if a number is a duck number
    	public static boolean isDuckNumber(int n) {
        	if (n == 0) return false;
        	String str = String.valueOf(n);
        	return str.contains("0");
    	}

    	public static void main(String[] args) {
        	Scanner sc=new Scanner(System.in);
        	int n=sc.nextInt();
        	System.out.println("Number of digits: " + countDigits(n));
        	System.out.println("Digits array: " + Arrays.toString(getDigits(n)));
        	System.out.println("Reversed array: " + Arrays.toString(reverseArray(getDigits(n))));
        	System.out.println("Is palindrome? : " + isPalindrome(n));
        	System.out.println("Is duck number? : " + isDuckNumber(n));
    	}
}
