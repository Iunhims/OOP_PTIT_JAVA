import java.util.Scanner;

public class Basic006{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character after the integer input
        while(t-- >0){
            String Input = sc.nextLine();
            int count = 0;
           for(int i = 0; i < Input.length(); i++){
                if(Character.isDigit(Input.charAt(i))){
                    count++;
                }
           }
           System.out.println(count);
        }
    }
}