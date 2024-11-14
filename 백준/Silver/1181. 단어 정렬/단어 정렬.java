import java.io.*;
import java.util.*;

class Main {
    static int stoi(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = stoi(br.readLine());
        List<TreeSet<String>> lengthList = new ArrayList<>();

        // 길이 1부터 50까지의 리스트 생성
        for (int i = 0; i <= 50; i++) {
            lengthList.add(new TreeSet<>());
        }

        // 문자열 입력 및 길이별 TreeSet에 추가
        for (int i = 0; i < count; i++) {
            String input = br.readLine();
            int length = input.length();
            if (length <= 50) {
                lengthList.get(length).add(input);
            }
        }

        // 출력
        for (int i = 1; i <= 50; i++) {
            TreeSet<String> set = lengthList.get(i);
            for (String s : set) {
                bw.write(s);
                bw.newLine();
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
