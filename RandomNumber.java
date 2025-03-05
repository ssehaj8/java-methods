import java.util.Arrays;

public class RandomNumber {

    	// Generate an array of 4-digit random numbers
    	public static int[] generate4DigitRandomArray(int size) {
        	int[] numbers = new int[size];
        	for (int i = 0; i < size; i++) {
            		numbers[i] = 1000 + (int)(Math.random() * 9000); // 4-digit random number
        	}
        	return numbers;
    	}

    	// Find the average, minimum, and maximum value of an array
    	public static double[] findAverageMinMax(int[] numbers) {
        	int min = numbers[0];
        	int max = numbers[0];
        	int sum = 0;

        	for (int num : numbers) {
            		sum += num;
            		min = Math.min(min, num);
            		max = Math.max(max, num);
        	}

        	double average = (double) sum / numbers.length;
        	return new double[]{average, min, max};
    	}

	public static void main(String[] args) {
        	int size = 5;
        	int[] arr = generate4DigitRandomArray(size);

        	System.out.println("Generated numbers: " + Arrays.toString(arr));

        	double[] stats = findAverageMinMax(arr);
        	System.out.println("Average: " + stats[0]);
       		System.out.println("Minimum: " + stats[1]);
        	System.out.println("Maximum: " + stats[2]);
	}
}
