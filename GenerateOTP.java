import java.util.Arrays;

public class GenerateOTP {

    // Method to generate a six-digit OTP
    public static String generateOTP() {
        int otp = (int)(Math.random() * 900000) + 100000;
        return String.valueOf(otp);
    }

    // Method to ensure OTPs are unique
    public static boolean isUnique(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                //In case of dupplicates
                if (arr[i].equals(arr[j])) {
                    return false; 
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] arr = new String[10];

        // Generate 10 OTPs and store them in the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = generateOTP();
        }

        // Display the generated OTPs
        System.out.println("Generated OTPs: " + Arrays.toString(arr));

        // Check if OTPs are unique
        if (isUnique(arr)) {
            System.out.println("UNIQUE.");
        } 
        else {
            System.out.println("DUPLICATE");
        }
    }
}
