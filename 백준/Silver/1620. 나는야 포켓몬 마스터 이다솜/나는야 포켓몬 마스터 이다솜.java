import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, String> dogam = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            String pokemon = br.readLine();
            dogam.put(String.valueOf(i), pokemon);
            dogam.put(pokemon, String.valueOf(i));
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            String q = br.readLine();
            sb.append(dogam.get(q)).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
    }
}