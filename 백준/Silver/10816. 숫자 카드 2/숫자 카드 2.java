import java.util.*;
import java.io.*;

class Main {
    static int stoi (String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st;

        Map<Integer, Integer> map = new HashMap<>();

        int n = stoi(br.readLine());
        st = new StringTokenizer (br.readLine());
        for (int i = 0; i < n; i++) {
            int key = stoi(st.nextToken());
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();

        int m = stoi(br.readLine());
        st = new StringTokenizer (br.readLine());
        for (int i = 0; i < m; i++) {
            int key = stoi(st.nextToken());
            sb.append(map.getOrDefault(key,  0)).append(' ');
        }

        bw.write(sb.toString());
        bw.flush();

    }
}