import java.util.Scanner;

public class MassUnitConverter {

    	// Convert Fahrenheit to Celsius
    	public static double convertFahrenheitToCelsius(double fahrenheit) {
        	return (fahrenheit - 32) * 5 / 9;
    	}

    	// Convert Celsius to Fahrenheit
    	public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    	}

    	// Convert Pounds to Kilograms
    	public static double convertPoundsToKilograms(double pounds) {
        	return pounds * 0.453592;
    	}

    	// Convert Kilograms to Pounds
    	public static double convertKilogramsToPounds(double kilograms) {
        	return kilograms * 2.20462;
    	}

    	// Convert Gallons to Liters
    	public static double convertGallonsToLiters(double gallons) {
        	return gallons * 3.78541;
    	}

    	// Convert Liters to Gallons
    	public static double convertLitersToGallons(double liters) {
        	return liters * 0.264172;
    	}

    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	//Take user input
        	System.out.print("Enter temperature in Fahrenheit: ");
        	double fahrenheit = sc.nextDouble();
        	System.out.println("In Celsius: " + convertFahrenheitToCelsius(fahrenheit));

        	System.out.print("Enter temperature in Celsius: ");
        	double celsius = sc.nextDouble();
        	System.out.println("In Fahrenheit: " + convertCelsiusToFahrenheit(celsius));

        	System.out.print("Enter weight in Pounds: ");
        	double pounds = sc.nextDouble();
        	System.out.println("In Kilograms: " + convertPoundsToKilograms(pounds));

        	System.out.print("Enter weight in Kilograms: ");
        	double kilograms = sc.nextDouble();
        	System.out.println("In Pounds: " + convertKilogramsToPounds(kilograms));

        	System.out.print("Enter volume in Gallons: ");
        	double gallons = sc.nextDouble();
        	System.out.println("In Liters: " + convertGallonsToLiters(gallons));

        	System.out.print("Enter volume in Liters: ");
        	double liters = sc.nextDouble();
        	System.out.println("In Gallons: " + convertLitersToGallons(liters));
    	}
}
