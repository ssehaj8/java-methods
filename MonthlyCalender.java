import java.util.Scanner;

public class MonthlyCalender {

	// Array of month names
    	private static final String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    	// Array of days in each month (non-leap year)
    	private static final int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    	// Method to display the calendar for a given month and year
    	public static void displayCalendar(int month, int year) {
		System.out.printf("%s %d%n", months[month - 1], year);
        	System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        	int days = getDaysInMonth(month, year);
        	int startDay = getStartDay(month, year);

        	// Indentation for the first day
        	for (int i = 0; i < startDay; i++) {
        		System.out.print("    ");
        	}
	
        	// Print the days of the month
        	for (int day = 1; day <= days; day++) {
            		System.out.printf("%3d ", day);
            		if ((startDay + day) % 7 == 0) {
                		System.out.println();
            		}
        	}
        	System.out.println();
    	}

    	// Method to get the number of days in a given month
    	public static int getDaysInMonth(int month, int year) {
        	if (month == 2 && isLeapYear(year)) {
            		return 29;
        	}
        	return daysInMonth[month - 1];
    	}

    	// Method to determine if a year is a leap year
    	public static boolean isLeapYear(int year) {
        	return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    	}

    	// Method to calculate the starting day of the month
    	public static int getStartDay(int month, int year) {
        	int d = 1;
        	int y = year - (14 - month) / 12;
        	int x = y + y / 4 - y / 100 + y / 400;
        	int m = month + 12 * ((14 - month) / 12) - 2;
        	return (d + x + (31 * m) / 12) % 7;
    	}

    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter month (1-12): ");
        	int month = sc.nextInt();

        	System.out.print("Enter year: ");
        	int year = sc.nextInt();

        	displayCalendar(month, year);
    	}
} 

