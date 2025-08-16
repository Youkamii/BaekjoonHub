import java.io.*;
import java.util.*;

public class Main {
    static final int[] dx = {1,-1, 0, 0, 0, 0};
    static final int[] dy = {0, 0, 1,-1, 0, 0};
    static final int[] dz = {0, 0, 0, 0, 1,-1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int[][][] box = new int[h][n][m];
        ArrayDeque<int[]> dq = new ArrayDeque<>();

        for (int z = 0; z < h; z++) {
            for (int y = 0; y < n; y++) {
                st = new StringTokenizer(br.readLine());
                for (int x = 0; x < m; x++) {
                    int tomato = Integer.parseInt(st.nextToken());
                    box[z][y][x] = tomato;
                    if (tomato == 1) {
                        dq.add(new int[]{z, y, x});
                    }
                }
            }
        }
        
        while(!dq.isEmpty()) {
            int[] cur = dq.poll();
            int z = cur[0];
            int y = cur[1];
            int x = cur[2];
            
            for (int d = 0; d < 6; d++) {
                int nxt = x + dx[d];
                int nyt = y + dy[d];
                int nzt = z + dz[d];
                
                if (nxt < 0 || nyt < 0 || nzt < 0 || nxt >= m || nyt >= n || nzt >= h)
                    continue;
                 if (box[nzt][nyt][nxt] == 0) {
                    box[nzt][nyt][nxt] = box[z][y][x] + 1;
                    dq.add(new int[]{nzt, nyt, nxt});
                }
            }
        }
        
        int max = 0;
        for (int z = 0; z < h; z++) {
            for (int y = 0; y < n; y++) {
                for (int x = 0; x < m; x++) {
                    if (box[z][y][x] == 0) {
                        System.out.println(-1);
                        return;
                    }
                    if (box[z][y][x] > max)
                        max = box[z][y][x];
                }
            }
        }
        System.out.println(max - 1);
    }
}
