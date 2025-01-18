import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] solutions = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            solutions[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(solutions);

        int left = 0, right = N - 1;
        int closestSum = Integer.MAX_VALUE;
        int answer1 = 0, answer2 = 0;

        while (left < right) {
            int sum = solutions[left] + solutions[right];

            if (Math.abs(sum) < closestSum) {
                closestSum = Math.abs(sum);
                answer1 = solutions[left];
                answer2 = solutions[right];
            }

            if (sum < 0) left++;
            else right--;
        }

        System.out.println(answer1 + " " + answer2);
    }
}
