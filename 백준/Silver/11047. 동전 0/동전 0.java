import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] coins = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++)
            coins[i] = Integer.parseInt(br.readLine());

        for (int i = n - 1; i >= 0; i--) {
            if (coins[i] <= k) {
                count += k / coins[i];
                k %= coins[i];
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
    }
}
