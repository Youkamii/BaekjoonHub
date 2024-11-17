import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner scanner = new Scanner(System.in);

        int sugar = scanner.nextInt();
        int t = 0;

        while (sugar % 5 != 0 && sugar > 2) {
            sugar -= 3;
            t++;
        }

        bw.write(String.valueOf(sugar == 0 || sugar % 5 == 0 ? t + (sugar / 5) : -1));
        bw.flush();

    }
}