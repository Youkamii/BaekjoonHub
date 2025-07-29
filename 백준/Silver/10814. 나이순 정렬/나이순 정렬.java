import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(r.readLine());

        StringBuilder[] b = new StringBuilder[201];
        for (int i = 0; i <= 200; i++)
            b[i] = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String l = r.readLine();
            int s = l.indexOf(' ');
            int a = 0;
            for (int j = 0; j < s; j++) 
                a = a * 10 + (l.charAt(j) - '0');
            b[a].append(l).append('\n');
        }

        for (StringBuilder c : b) w.write(c.toString());
        w.flush();
    }
}
