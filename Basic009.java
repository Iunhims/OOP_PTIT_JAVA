import java.util.Scanner;

public class Basic009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        
        for (int i = 0; i < T; i++) {
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            
            if (x == 0 || y == 0) {
                System.out.println(0);
            } else if (x > 0 && y > 0) {
                System.out.println(1);
            } else if (x < 0 && y > 0) {
                System.out.println(2);
            } else if (x < 0 && y < 0) {
                System.out.println(3);
            } else if (x > 0 && y < 0) {
                System.out.println(4);
            }
        }
        
        scanner.close();
    }
}