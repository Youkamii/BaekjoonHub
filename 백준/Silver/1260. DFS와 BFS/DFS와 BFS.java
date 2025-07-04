import java.util.*;
import java.io.*;

class Main {
    static boolean[] visited;
    static List<Integer>[] graph;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) graph[i] = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u].add(v);
            graph[v].add(u);
        }

        for (int i = 1; i <= N; i++) Collections.sort(graph[i]);
        sb = new StringBuilder();
        visited = new boolean[N + 1];
        dfs(V);
        sb.append("\n");
        visited = new boolean[N + 1];
        bfs(V);
        System.out.println(sb);
    }

    static void dfs(int node) {
        visited[node] = true;
        sb.append(node).append(" ");
        for (int next : graph[node]) {
            if (!visited[next]) dfs(next);
        }
    }

    static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        while (!queue.isEmpty()) {
            int node = queue.poll();
            sb.append(node).append(" ");
            for (int next : graph[node]) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.add(next);
                }
            }
        }
    }
}
