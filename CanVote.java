import java.util.Scanner;

public class CanVote {

	// Method to check if a student can vote
    	public static boolean canStudentVote(int age) {
        	if (age < 0) {
            		return false; // Invalid age
        	}
        	return age >= 18; // Returns true if 18 or older, false otherwise
    	}

    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
        	int[] arr = new int[10];

        	// Take user input for the ages of 10 students
        	for (int i = 0; i < 10; i++) {
            		System.out.print("Enter the age of student " + (i + 1) + ": ");
            		arr[i] = sc.nextInt();
        	}

        	// Check if each student can vote and display the result
        	for (int i = 0; i < arr.length; i++) {
            		if (canStudentVote(arr[i])) {
                		System.out.println("YES!, student " + (i + 1) + " (Age: " + arr[i] + ") can vote.");
            		} 
            		else {
                		System.out.println("NO!, student " + (i + 1) + " (Age: " + arr[i] + ") cannot vote.");
            		}
        	}
    	}
}
