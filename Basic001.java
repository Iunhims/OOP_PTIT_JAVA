import java.util.Scanner;
class Basic001{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String Chuoi = sc.nextLine();
            System.out.println(Chuoi);
        }
        sc.close();
    }
}
