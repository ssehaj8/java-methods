import java.util.Scanner;

public class LeapYear {

	// Method to check if a year is a leap year
    	public static boolean isLeapYear(int year) {
        	// Leap year only valid for years >= 1582
        	if (year <= 1582) {
            		System.out.println("The year must be 1582 or later.");
            		return false;
        	}

        	// Leap year conditions: divisible by 4 and not by 100, unless also divisible by 400
        	return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    	}

    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	// Take user input for year
        	System.out.print("Enter a year: ");
        	int year = sc.nextInt();

        	// Check if it's a leap year and print result
        	if (isLeapYear(year)) {
            		System.out.println("YES, " + year + " is a leap year.");
        	} 
        	else {
            		System.out.println("NO, " + year + " is not a leap year.");
        	}
    	}
}
