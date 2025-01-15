import java.util.*;
import java.io.*;

class Main {

    static int[] dot;

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        dot = new int[N];        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) dot[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(dot);

        for (int i = 0; i < M; i++) {
            int count = 0;
            st = new StringTokenizer(br.readLine());
            int min = Integer.parseInt(st.nextToken());
            int max = Integer.parseInt(st.nextToken());

            sb.append(upper(max) - lower(min)).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
    }

    static int lower(int target) {
        int low = 0, high = dot.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (dot[mid] >= target) high = mid;
            else low = mid + 1;
        }
        return low;
    }

    static int upper(int target) {
        int low = 0, high = dot.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (dot[mid] > target) high = mid;
            else low = mid + 1;
        }
        return low;
    }
}