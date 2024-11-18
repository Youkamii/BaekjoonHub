import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[11]; 
        
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        
        for (int i = 4; i <= 10; i++)
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++)
            bw.write(dp[Integer.parseInt(br.readLine())] + "\n");
        
        bw.flush();        
    }
}