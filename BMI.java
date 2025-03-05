import java.util.Scanner;

public class BMI {
    
	// Method to calculate BMI
    	public static double calculateBMI(double weight, double heightCm) {
        	// Convert cm to meters
        	double heightMeters = heightCm / 100;
        	return weight / (heightMeters * heightMeters);
    	}
    
    	// Method to determine BMI status
    	public static String getBMIStatus(double bmi) {
        	if (bmi <= 18.4) {
                	return("Underweight");
        	} 
		else if (bmi>=18.5 && bmi <= 24.9) {
                	return("Normal");
        	} 
		else if (bmi>=25.0 && bmi <= 39.9) {
                	return("Overweight");
        	} 
		else {
               		return("Obese");
          	}
    	}
    
    	public static void main(String[] args) {
        	Scanner scanner = new Scanner(System.in);
        	double[][] data = new double[10][3]; // 10 rows, 3 columns (Weight, Height, BMI)
        	String[] bmiStatus = new String[10];
        
        	// Taking user input
        	for (int i = 0; i < 10; i++) {
            		System.out.println("Enter details for Person " + (i + 1) + ":");
            		System.out.print("Enter weight (kg): ");
            		data[i][0] = scanner.nextDouble();
            		System.out.print("Enter height (cm): ");
            		data[i][1] = scanner.nextDouble();
            
            		// Calculate BMI and store it in array
            		data[i][2] = calculateBMI(data[i][0], data[i][1]);
            		bmiStatus[i] = getBMIStatus(data[i][2]);
        	}
        
        	// Display results
        	System.out.println("\nResults:");
        	System.out.printf("%-10s %-10s %-10s %-15s\n", "Weight(kg)", "Height(cm)", "BMI", "Status");
        	for (int i = 0; i < 10; i++) {
            		System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n", data[i][0], data[i][1], data[i][2], bmiStatus[i]);
        	}
    	}
}
