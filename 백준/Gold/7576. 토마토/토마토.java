import java.io.*;
import java.util.*;

public class Main {
    static int[][] tomato;
    static Queue<int[]> queue = new LinkedList<>();
    static int dayCount = 0;
    static int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    static int stoi(String s) {
        return Integer.parseInt(s);
    }

    static void bfsTomato() {
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] cur = queue.poll();
                int curY = cur[0];
                int curX = cur[1];
                for (int[] dir : directions) {
                    int nextY = curY + dir[0];
                    int nextX = curX + dir[1];
                    if (nextY >= 0
                        && nextX >= 0
                        && nextY < tomato.length
                        && nextX < tomato[0].length
                        && tomato[nextY][nextX] == 0) {
                        tomato[nextY][nextX] = 1;
                        queue.add(new int[]{nextY, nextX});
                    }
                }
            }
            if(!queue.isEmpty()) {
                dayCount++;
            }
        }
    }

    static boolean checkAllRed(int[][] tomato) {
        for (int i = 0; i < tomato.length; i++) {
            for (int j = 0; j < tomato[i].length; j++)
                if (tomato[i][j] == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = stoi(st.nextToken());
        int y = stoi(st.nextToken());

        tomato = new int[y][x];
        for (int i = 0; i < y; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < x; j++) {
                tomato[i][j] = stoi(st.nextToken());
                if (tomato[i][j] == 1) {
                    queue.add(new int[]{i, j});
                }
            }
        }

        bfsTomato();

        if (checkAllRed(tomato)) {
            System.out.println(dayCount);
        } else {
            System.out.println(-1);
        }
    }
}