import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] l = br.readLine().split(" ");
        int n = Integer.parseInt(l[0]);
        int m = Integer.parseInt(l[1]);

        int[] numbers = new int[n + 1];
        String[] nums = br.readLine().split(" ");
        for (int i = 1; i <= n; i++)
            numbers[i] = numbers[i - 1] + Integer.parseInt(nums[i - 1]);        

        for (int k = 0; k < m; k++) {
            String[] range = br.readLine().split(" ");
            int i = Integer.parseInt(range[0]);
            int j = Integer.parseInt(range[1]);
            bw.write((numbers[j] - numbers[i - 1]) + "\n");
        }

        bw.flush();
    }
}
