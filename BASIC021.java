import java.util.Scanner;
class Giaithua{
public long giaithua(int n){
    if(n == 1){
        return 1;
    }else{
        return n * giaithua(n-1);
    }
}
}

public class BASIC021{




    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

     Giaithua gt = new Giaithua();
        long sum = 0;
       

        System.out.println("Factorials of numbers from 1 to " + n + ":");
        for(int i = 1; i<=n;i++){ 
            long f = gt.giaithua(i);
            System.out.println(i + "! = " + f);
            sum += f;
        }

        System.out.println("The sum of these factorials is: " + sum);
    } 
}