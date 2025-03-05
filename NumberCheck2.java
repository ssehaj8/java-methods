import java.util.Scanner;
import java.util.Arrays;


public class NumberCheck2 {

    // Method to find the count of digits in the number
    public static int countDigits(int n) {
        return String.valueOf(Math.abs(n)).length();
    }

    // Method to store the digits of the number in an array
    public static int[] getDigits(int n) {
        String str = String.valueOf(Math.abs(n));
        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            digits[i] = Character.getNumericValue(str.charAt(i));
        }
        return digits;
    }

    // Method to find the sum of the digits of a number
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int i=0;i<digits.length;i++) {
            sum += digits[i];
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits of a number
    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int i=0;i<digits.length;i++) {
            sum += Math.pow(digits[i], 2);
        }
        return sum;
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshad(int n) {
        int[] digits = getDigits(n);
        int sum = sumOfDigits(digits);
        return n % sum == 0;
    }

    // Method to find the frequency of each digit in the number
    public static int[][] digitFrequency(int[] digits) {
        int[][] frequency = new int[10][2]; // 0-9 possible digits
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i; // Digit
            frequency[i][1] = 0; // Frequency
        }
        for (int i=0;i<digits.length;i++) {
            frequency[digits[i]][1]++;
        }
        return frequency;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int[] digits = getDigits(n);

        System.out.println("Number of digits: " + countDigits(n));
        System.out.println("Digits array: " + Arrays.toString(digits));
        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares of digits: " + sumOfSquares(digits));
        System.out.println("Is Harshad number: " + isHarshad(n));

        System.out.println("Digit Frequency:");
        int[][] frequency = digitFrequency(digits);
        for (int[] freq : frequency) {
            if (freq[1] > 0) {
                System.out.println("Digit " + freq[0] + " occurs " + freq[1] + " times");
            }
        }
    }
}
