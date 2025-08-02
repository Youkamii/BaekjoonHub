import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int cur = Integer.parseInt(br.readLine());

            if (cur == 0) {
                if (pq.isEmpty())
                    sb.append('0').append('\n');
                else
                    sb.append(pq.poll()).append('\n');
            } else
                pq.offer(cur);
        }

        bw.write(sb.toString());
        bw.flush();
    }
}