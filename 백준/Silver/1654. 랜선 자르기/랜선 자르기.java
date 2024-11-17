import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] arr = new int[k];
        long max = 0;

        for (int i = 0; i < k; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (arr[i] > max) max = arr[i];
        }

        long low = 1, high = max, res = 0;

        while (low <= high) {
            long mid = (low + high) / 2;
            long count = 0;

            for (int len : arr) count += (len / mid);

            if (count >= n) {
                res = mid;
                low = mid + 1;
            } else
                high = mid - 1;
        }

        bw.write(res + "\n");
        bw.flush();
    }
}