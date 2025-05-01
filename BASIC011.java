import java.util.Scanner;

 class MinGap {
    public static int minGap(int[] numbers) {
        // If array has less than 2 elements, return 0
        if (numbers == null || numbers.length < 2) {
            return 0;
        }
        
        // Initialize minGap with the first gap
        int minGap = numbers[1] - numbers[0];
        
        // Find minimum gap by comparing each adjacent pair
        for (int i = 1; i < numbers.length - 1; i++) {
            int gap = numbers[i + 1] - numbers[i];
            if (gap < minGap) {
                minGap = gap;
            }
        }
        
        return minGap;
    }
}
public class BASIC011{
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read number of test cases
        int numberOfTestCases = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        // Process each test case
        for (int t = 0; t < numberOfTestCases; t++) {
            String line = scanner.nextLine();
            String[] numbers = line.trim().split("\\s+");
            
            // Convert string array to int array
            int[] arr = new int[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                arr[i] = Integer.parseInt(numbers[i]);
            }
            
            // Calculate and print minimum gap
            System.out.println(MinGap.minGap(arr));
        }
        
        scanner.close();
    }
}
   