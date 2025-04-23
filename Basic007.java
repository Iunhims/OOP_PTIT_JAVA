import java.util.Scanner;

public class Basic007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int numberOfTestCases = scanner.nextInt();
        
        for (int i = 0; i < numberOfTestCases; i++) {
            // Read L and R for each test case
            int L = scanner.nextInt();
            int R = scanner.nextInt();
            
            // Calculate the sum from L to R
            int sum = 0;
            for (int j = L; j <= R; j++) {
                sum += j;
            }
            
            // Print the result
            System.out.println(sum);
        }
        
        scanner.close();
    }
}

