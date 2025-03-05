import java.util.Random;

public class FootballHeight {

    //Method to find total sum of heights
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }
        return sum;
    }

    //Method to find mean height
    public static double findMean(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }

    //Method to find shortest height
    public static int findShortest(int[] heights) {
        int shortest = heights[0];
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] < shortest) {
                shortest = heights[i];
            }
        }
        return shortest;
    }

    //Method to find tallest height
    public static int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] > tallest) {
                tallest = heights[i];
            }
        }
        return tallest;
    }

  
    public static void main(String[] args) {
        int[] heights = new int[11];
        Random random = new Random();

        // Generating random heights between 150 and 250 cm
        for (int i = 0; i < heights.length; i++) {
            // 150 to 250
            heights[i] = random.nextInt(101) + 150; 
        }

        // Displaying the generated heights
        System.out.print("Heights of players: ");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println();

        System.out.println("Mean height: " + findMean(heights) + " cm");
        System.out.println("Shortest height: " + findShortest(heights) + " cm");
        System.out.println("Tallest height: " + findTallest(heights) + " cm");
    }
}
