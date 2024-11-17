import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

class Main {
    static int stoi(String s) {
        return Integer.parseInt(s);
    }

    static public void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        Set<Integer> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        int n1 = stoi(st.nextToken());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n1; i++)
            set.add(stoi(st.nextToken()));

        st = new StringTokenizer(br.readLine());
        int n2 = stoi(st.nextToken());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n2; i++) {
            if (set.contains(stoi(st.nextToken())))
                sb.append(1).append("\n");
            else
                sb.append(0).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
    }
}