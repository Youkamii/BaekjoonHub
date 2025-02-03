import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int total = 0;

        if (a == b && b == c)
            bw.write(10000 + a * 1000 + "\n");
        else if (a == b || a == c)
            bw.write(1000 + a * 100 + "\n");
        else if (b == c)
            bw.write(1000 + b * 100 + "\n");
        else
            bw.write(Math.max(a, Math.max(b, c)) * 100 + "\n");

        bw.flush();
    }
}
