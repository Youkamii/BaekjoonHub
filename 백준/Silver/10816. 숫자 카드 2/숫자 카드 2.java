import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int[] parray = new int[10000001];
        int[] marray = new int[10000001];

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int key = Integer.parseInt(st.nextToken());
            if (key >= 0)
                parray[key] += 1;
            else
                marray[-key] += 1;
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            int key = Integer.parseInt(st.nextToken());
            if (key >= 0)
                sb.append(parray[key]).append(" ");
            else
                sb.append(marray[-key]).append(" ");
        }

        bw.write(sb.toString());
        bw.flush();
    }
}