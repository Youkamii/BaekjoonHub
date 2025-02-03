import java.io.*;
import java.util.*;

public class Main {
    
    static int stoi(String s) {
        return Integer.parseInt(s);
    }
    
    static int checkPainting (char[][] tile, int i, int j) {
        int black = 0;
        int white = 0;
        
        for (int y = i; y < i + 8; y++) {
            for (int x = j; x < j + 8; x++) {
                if ((x + y) % 2 == 0) {
                    if (tile[y][x] == 'B') white++;
                    else black++;
                } else {
                    if (tile[y][x] == 'W') white++;
                    else black++;
                }
            }
        }
        return Math.min(white, black);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int y = stoi(st.nextToken());
        int x = stoi(st.nextToken());
        
        char[][] tile = new char[y][x];
        
        for (int i = 0; i < y; i++) {
            String currentX = br.readLine();
            for (int j = 0; j < x; j++) tile[i][j] = currentX.charAt(j);
        }
        
        int minCount = 32;
    
        for (int i = 0; i <= y-8; i++) {
            for (int j = 0; j <= x-8; j++) {
                int currentCount = checkPainting(tile, i, j);
                if (minCount > currentCount)
                    minCount = currentCount;
            }
        }
        
        bw.write(minCount + "\n");
        bw.flush();
    }
}
