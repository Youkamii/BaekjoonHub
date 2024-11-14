import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] counts = new int[10001];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            counts[Integer.parseInt(br.readLine())]++;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= 10000; i++) {
            while(counts[i] > 0) {
                sb.append(i).append('\n');
                counts[i]--;
            }
        }
        System.out.print(sb);
    }
}
