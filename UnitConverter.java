import java.util.Scanner;

public class UnitConverter {

    	// Method to convert kilometers to miles
    	public static double convertKmToMiles(double km) {
        	double km2miles = 0.621371;
        	return km * km2miles;
    	}

    	// Method to convert miles to kilometers
    	public static double convertMilesToKm(double miles) {
        	double miles2km = 1.60934;
        	return miles * miles2km;
    	}

    	// Method to convert meters to feet
    	public static double convertMetersToFeet(double meters) {
        	double meters2feet = 3.28084;
        	return meters * meters2feet;
    	}

    	// Method to convert feet to meters
    	public static double convertFeetToMeters(double feet) {
        	double feet2meters = 0.3048;
        	return feet * feet2meters;
    	}

    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
        	//Take user input
        	System.out.print("Enter value in kilometers: ");
        	double km = sc.nextDouble();
        	System.out.printf("%.2f km is %.2f miles.%n", km, convertKmToMiles(km));

        	System.out.print("Enter value in miles: ");
        	double miles = sc.nextDouble();
        	System.out.printf("%.2f miles is %.2f km.%n", miles, convertMilesToKm(miles));

        	System.out.print("Enter value in meters: ");
        	double meters = sc.nextDouble();
        	System.out.printf("%.2f meters is %.2f feet.%n", meters, convertMetersToFeet(meters));

        	System.out.print("Enter value in feet: ");
        	double feet = sc.nextDouble();
        	System.out.printf("%.2f feet is %.2f meters.%n", feet, convertFeetToMeters(feet));
    }
}
