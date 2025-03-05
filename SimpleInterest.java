import java.util.Scanner;

public class SimpleInterest{
	// Method to calculate simple interest
    	public static double calculateSimpleInterest(double principal, double rate, double time) {
        // Formula for simple interest: SI = (Principal * Rate * Time) / 100
        return (principal * rate * time) / 100;
    	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

        	// Take user input for principal, rate, and time
        	System.out.print("Enter Principal amount: ");
		int principal = sc.nextInt();
		System.out.print("Enter Rate of interest: ");
	        double rate = sc.nextDouble();
		System.out.print("Enter Time (in years): ");
		int time=sc.nextInt();
		
		//Make a call to method that calculates simple interest and store it in a variable
		double simpleInterest = calculateSimpleInterest(principal, rate, time);
		
		//Display the results
		System.out.printf("The Simple Interest is %.2f for Principal %d, Rate of Interest %.2f and Time %d years.%n", simpleInterest, principal, rate, time);
	}
}
