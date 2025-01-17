import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] lectures = new int[N];
        st = new StringTokenizer(br.readLine());
        int max = 0;
        int sum = 0;

        for (int i = 0; i < N; i++) {
            lectures[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, lectures[i]);
            sum += lectures[i];
        }

        int low = max;
        int high = sum;
        int result = high;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (dvd(lectures, M, mid)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        sb.append(result).append("\n");
        System.out.print(sb);
    }

    static boolean dvd(int[] lectures, int M, int size) {
        int count = 1;
        int currentSum = 0;

        for (int lecture : lectures) {
            if (currentSum + lecture > size) {
                count++;
                currentSum = lecture;
                if (count > M) {
                    return false;
                }
            } else {
                currentSum += lecture;
            }
        }

        return true;
    }
}
