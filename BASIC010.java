import java.util.Scanner;
public class BASIC010 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); 

        while(t-- > 0){
            String n = sc.nextLine();
            char[] arr = n.toCharArray();
            int leng = arr.length;
            int start = (leng%2 == 1 ) ? 1 : 0;
            for(int i = start; i< leng -1; i+=2){
                char temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp; 
            }
        System.out.println(new String(arr));
        }
    }
}
