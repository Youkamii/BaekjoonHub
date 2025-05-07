import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 1) 입력 리더
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 2) 나이별 버킷 준비
        StringBuilder[] buckets = new StringBuilder[201];
        for (int i = 0; i <= 200; i++) {
            buckets[i] = new StringBuilder();
        }

        // 3) 한 줄씩 읽어서 수동 파싱
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            int space = line.indexOf(' ');
            // 수동으로 나이 파싱 (substring 대신)
            int age = 0;
            for (int j = 0; j < space; j++) {
                age = age * 10 + (line.charAt(j) - '0');
            }
            // 그대로 버킷에 쌓기 (line 안에 "age name" 형태)
            buckets[age].append(line).append('\n');
        }
        br.close();

        // 4) 한 번에 출력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder out = new StringBuilder();
        for (StringBuilder sb : buckets) {
            out.append(sb);
        }
        bw.write(out.toString());
        bw.flush();
        bw.close();
    }
}
