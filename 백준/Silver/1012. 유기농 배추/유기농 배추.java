import java.util.*;
import java.io.*;

class Main {

    static int[][] farm;
    static boolean[][] visited;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};
    static int x, y;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int tk = Integer.parseInt(st.nextToken());

        for (int t = 0; t < tk; t++) {
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            int worm = Integer.parseInt(st.nextToken());
            farm = new int[y][x];
            visited = new boolean[y][x];

            for (int w = 0; w < worm; w++) {
                st = new StringTokenizer(br.readLine());
                int wx = Integer.parseInt(st.nextToken());
                int wy = Integer.parseInt(st.nextToken());
                farm[wy][wx] = 1;
            }

            int needWorms = 0;
            for (int i = 0; i < y; i++) {
                for (int j = 0; j < x; j++) {
                    if (farm[i][j] == 1 && !visited[i][j]) {
                        dfs(i, j);
                        needWorms++;
                    }
                }
            }
            bw.write(needWorms + "\n");
        }
        bw.flush();
    }

    static void dfs(int i, int j) {
        visited[i][j] = true;

        for (int d = 0; d < 4; d++) {
            int ni = i + dy[d];
            int nj = j + dx[d];

            if (ni >= 0 && ni < y && nj >= 0 && nj < x) {
                if (farm[ni][nj] == 1 && !visited[ni][nj]) {
                    dfs(ni, nj);
                }
            }
        }
    }
}
