import java.util.Scanner;


 public class Basic002 {
    private static final int MOD = 1000000007;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int k = sc.nextInt();
            int n = sc.nextInt();
            int goal = sc.nextInt();
            System.out.println(numMusicPlaylists(n,goal,k));
        }
        sc.close();
    }

    public static int numMusicPlaylists(int n, int goal, int k){
        long[][] dp = new long[goal+1][n+1];
        dp[0][0] =1;
        for(int i = 1; i<= n; i++){
            for(int j = 1; j<= goal; j++){
                 dp[i][j] = dp[i-1][j-1]* (n-j+1)%MOD;
                    if(j>k){
                        dp[i][j] = (dp[i][j] + dp[i-1][j]*(j-k)%MOD)%MOD;
                    }
            }
        }
        return (int)dp[goal][n];
    }
 }