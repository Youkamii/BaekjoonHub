import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        Set<Integer> set = new HashSet<>();
        Set<Integer> setAll = new HashSet<>();
        Collections.addAll(setAll, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String order = st.nextToken();

            int v;

            switch(order) {

                case "add" :
                    v = Integer.parseInt(st.nextToken());
                    set.add(v);
                    break;

                case "remove" :
                    v = Integer.parseInt(st.nextToken());
                    set.remove(v);
                    break;

                case "check" :
                    v = Integer.parseInt(st.nextToken());
                    bw.write(set.contains(v) ? "1\n" : "0\n");
                    break;

                case "toggle" :
                    v = Integer.parseInt(st.nextToken());
                    if (set.contains(v))
                        set.remove(v);
                    else
                        set.add(v);
                    break;

                case "all" :
                    set = new HashSet<>(setAll);
                    break;

                case "empty" :
                    set = new HashSet<>();
                    break;
            }
        }

        bw.flush();
    }
}