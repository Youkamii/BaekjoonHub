import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        StringBuilder[] buckets = new StringBuilder[201];
        for (int i = 0; i <= 200; i++)
            buckets[i] = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            int space = line.indexOf(' ');
            int age = 0;
            for (int j = 0; j < space; j++) 
                age = age * 10 + (line.charAt(j) - '0');
            buckets[age].append(line).append('\n');
        }

        StringBuilder out = new StringBuilder();
        for (StringBuilder sb : buckets) out.append(sb);
        bw.write(out.toString());
        bw.flush();
    }
}
