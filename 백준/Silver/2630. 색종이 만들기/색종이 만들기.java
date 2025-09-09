import java.io.*;
import java.util.*;

public class Main {
    static int[][] paper;
    static int white = 0;
    static int blue = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        paper = new int[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        cutting(0, 0, n);

        System.out.println(white);
        System.out.println(blue);
    }

    static void cutting(int x, int y, int len) {
        if (checkColor(x, y, len)) {
            if (paper[x][y] == 0) white++;
            else blue++;
            return;
        }

        int hLen = len / 2;
        cutting(x, y, hLen);
        cutting(x, y + hLen, hLen);
        cutting(x + hLen, y, hLen);
        cutting(x + hLen, y + hLen, hLen);
    }

    static boolean checkColor(int x, int y, int len) {
        int color = paper[x][y];
        for (int i = x; i < x + len; i++) {
            for (int j = y; j < y + len; j++) {
                if (paper[i][j] != color) {
                    return false;
                }
            }
        }
        return true;
    }
}
