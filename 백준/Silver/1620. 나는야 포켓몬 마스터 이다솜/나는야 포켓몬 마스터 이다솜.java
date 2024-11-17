import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<Integer, String> intDogam = new HashMap<>();
        Map<String, Integer> stringDogam = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            String pokemon = br.readLine();
            intDogam.put(i, pokemon);
            stringDogam.put(pokemon, i);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            String q = br.readLine();
            if (Character.isDigit(q.charAt(0)))
                sb.append(intDogam.get(Integer.parseInt(q))).append("\n");
            else
                sb.append(stringDogam.get(q)).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
    }
}