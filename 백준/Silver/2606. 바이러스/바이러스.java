import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        List<List<Integer>> con = new ArrayList<>();
        for (int i = 0; i <= n; i++) con.add(new ArrayList<>());

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            con.get(a).add(b);
            con.get(b).add(a);
        }

        Set<Integer> set = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        set.add(1);

        while(!queue.isEmpty()) {
            int i = queue.poll();
            for (int connected : con.get(i)) {
                if (!set.contains(connected)) {
                    set.add(connected);
                    queue.add(connected);
                }
            }
        }

        bw.write(String.valueOf(set.size() - 1));
        bw.flush();
    }
}