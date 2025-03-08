import java.util.*;

public class RatioCalulator {
    public static void main(String[] args) {
        // Example array
        int[] arr = {1, 1, -1, -1, 0,-23,-33,0,-2222};
        
        // Calculate and print ratios
        calculateRatios(arr);
    }

    public static void calculateRatios(int[] arr) {
        int n = arr.length; // Total number of elements
        int positiveCount = 0, negativeCount = 0, zeroCount = 0;

        // Count positive, negative, and zero elements
        for (int num : arr) {
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        // Calculate ratios
        double positiveRatio = (double) positiveCount / n;
        double negativeRatio = (double) negativeCount / n;
        double zeroRatio = (double) zeroCount / n;

        // Print results with six decimal places
        System.out.printf("%.2f%n", positiveRatio);
        System.out.printf("%.2f%n", negativeRatio);
        System.out.printf("%.2f%n", zeroRatio);
    }
}
