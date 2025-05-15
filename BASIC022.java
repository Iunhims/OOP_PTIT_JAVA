import java.util.Scanner;

class checkPrime {
    public static boolean isPrime(int n){
        if(n < 2) return false;
        for(int i = 2; i<= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        } 
        return true;
    }
}

public class BASIC022{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        sc.nextLine();

        System.out.println("Primes in the range 2 to " + n + ":");

        if(n < 0){
            System.out.println("Error");
            return;
        }
        else{
            for(int i = 2; i <= n; i++){
                if(checkPrime.isPrime(i)){
                    System.out.println(i);
                    cnt++;
                }
            }
        }
        System.out.println("Total number of primes in the range: " + cnt);
        if(checkPrime.isPrime(cnt)){
            System.out.println("The prime count " + cnt + " is a prime number.");
        }
        else{
            System.out.println("The prime count " + cnt + " is not a prime number.");
        }
    }
}