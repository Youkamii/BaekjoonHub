import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        long[] P = new long[101];

        P[1] = 1; P[2] = 1; P[3] = 1;
        for (int i = 4; i <= 100; i++) P[i] = P[i - 2] + P[i - 3];

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            sb.append(P[N]).append("\n");
        }

        System.out.print(sb);
    }
}
