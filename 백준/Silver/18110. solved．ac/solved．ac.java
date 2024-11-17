import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(br.readLine());

        Arrays.sort(arr);

        int r = (int) Math.round(n * 0.15);
        int sum = 0;

        for (int i = r; i < n - r; i++)
            sum += arr[i];

        int count = n - 2 * r;
        int res = (int) Math.round((double) sum / count);

        bw.write(String.valueOf(res));
        bw.flush();
    }
}