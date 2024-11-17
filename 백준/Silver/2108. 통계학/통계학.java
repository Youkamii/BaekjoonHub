import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        int[] cnt = new int[8001];
        List<Integer> list = new ArrayList<>();
        int sum = 0, max = -4000, min = 4000;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            sum += num;
            cnt[num + 4000]++;
            list.add(num);
            if (num > max) max = num;
            if (num < min) min = num;
        }

        Collections.sort(list);
        int med = list.get(n / 2);

        int maxVal = 0, maxCnt = 0;
        boolean sec = false;

        for (int i = 0; i < 8001; i++) {
            if (cnt[i] > maxCnt) {
                maxCnt = cnt[i];
                maxVal = i - 4000;
                sec = false;
            } else if (cnt[i] == maxCnt && !sec) {
                maxVal = i - 4000;
                sec = true;
            }
        }

        int avg = (int) Math.round((double) sum / n);
        int range = max - min;

        bw.write(avg + "\n" + med + "\n" + maxVal + "\n" + range + "\n");
        bw.flush();
    }
}