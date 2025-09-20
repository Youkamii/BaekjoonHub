import java.util.*;
import java.io.*;

class Main {

    static final int road = 100000;
    static int 동생;

    static int BFS(List<Integer> cur, boolean[] visited, int depth) {
        for (int x : cur) if (x == 동생) return depth;
        List<Integer> next = new ArrayList<>();
        for (int x : cur) {
            int[] nb = {x - 1, x + 1, x * 2};
            for (int y : nb) {
                if (0 <= y && y <= road && !visited[y]) {
                    visited[y] = true;
                    next.add(y);
                }
            }
        }
        return BFS(next, visited, depth + 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int 수빈 = Integer.parseInt(st.nextToken());
        동생 = Integer.parseInt(st.nextToken());

        boolean[] visited = new boolean[road + 1];
        visited[수빈] = true;

        List<Integer> start = new ArrayList<>();
        start.add(수빈);

        System.out.println(BFS(start, visited, 0));
    }
}
