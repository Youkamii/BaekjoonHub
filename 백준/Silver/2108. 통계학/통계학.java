import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        int[] cnt = new int[8001];
        int sum = 0, max = -4000, min = 4000, maxCnt = 0, totalCount = 0;
        int median = 0, mode = 0;
        boolean secondMode = false;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            sum += num;
            cnt[num + 4000]++;
            if (num > max) max = num;
            if (num < min) min = num;
        }

        for (int i = 0; i < 8001; i++) {
            if (cnt[i] > maxCnt) {
                maxCnt = cnt[i];
                mode = i - 4000;
                secondMode = false;
            } else if (cnt[i] == maxCnt && !secondMode) {
                mode = i - 4000;
                secondMode = true;
            }

            if (totalCount < n / 2 + 1) {
                totalCount += cnt[i];
                if (totalCount >= n / 2 + 1 && median == 0) {
                    median = i - 4000;
                }
            }
        }

        int avg = (int) Math.round((double) sum / n);
        int range = max - min;

        bw.write(avg + "\n" + median + "\n" + mode + "\n" + range + "\n");
        bw.flush();
    }
}