import java.util.Scanner;

public class ChillTemprature {

	// Method to calculate wind chill temperature
    	public static double calculateWindChill(double temp, double windSpeed) {
        	//Calculate and store windchill temperature
        	double res= 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(windSpeed, 0.16);
        
        	//Return resulting windchill temp
        	return res; 
    	}
  
    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	// Take user input for temperature and wind speed
        	System.out.print("Enter temperature in Fahrenheit: ");
        	double temp = sc.nextDouble();

        	System.out.print("Enter wind speed in miles per hour: ");
        	double windSpeed = sc.nextDouble();
	
        	// Calculate wind chill
        	double windChill = calculateWindChill(temp, windSpeed);

        	// Display the result
        	System.out.printf("The wind chill temperature is %.2f°F.%n", windChill);
    	}

    
}
