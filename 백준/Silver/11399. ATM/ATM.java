import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] times = new int[n];
        for (int i = 0; i < n; i++)
            times[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(times);

        int sum = 0;
        int total = 0;
        for (int time : times) {
            sum += time;
            total += sum;
        }

        bw.write(total + "\n");
        bw.flush();
    }
}
