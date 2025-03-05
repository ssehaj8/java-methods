import java.util.Scanner;

public class CollinearPoints {

    	// Method to check collinearity using slope formula
    	public static boolean areCollinearUsingSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        	return (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1);
    	}

    	// Method to check collinearity using the area of triangle formula
    	public static boolean areCollinearUsingArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        	int area = (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        	return area == 0;
    	}

    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	// Taking input for three points
        	System.out.print("Enter x1 and y1: ");
        	int x1 = sc.nextInt();
        	int y1 = sc.nextInt();

        	System.out.print("Enter x2 and y2: ");
        	int x2 = sc.nextInt();
        	int y2 = sc.nextInt();

        	System.out.print("Enter x3 and y3: ");
        	int x3 = sc.nextInt();
        	int y3 = sc.nextInt();

        	// Checking collinearity using slope
        	if (areCollinearUsingSlope(x1, y1, x2, y2, x3, y3)) {
            		System.out.println("The points are collinear using the slope method.");
        	} 
        	else {
            		System.out.println("The points are NOT collinear using the slope method.");
        	}
      

        	// Checking collinearity using area of triangle
        	if (areCollinearUsingArea(x1, y1, x2, y2, x3, y3)) {
            		System.out.println("The points are collinear using the area method.");
        	} 
        	else {
            		System.out.println("The points are NOT collinear using the area method.");
        	}

    	}
}
