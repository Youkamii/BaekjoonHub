import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    static final int INF = 1_000_000_000;
    static int N, M;
    static char[][] grid;
    static int[][] cellId;
    static int nodeCount;
    static int source, sink;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};
    static ArrayList<Edge>[] graph;
    static int[] level;
    static int[] ptr;

    static class Edge {
        int to, rev;
        int capacity;

        Edge(int to, int rev, int capacity) {
            this.to = to;
            this.rev = rev;
            this.capacity = capacity;
        }
    }

    static void addEdge(int u, int v, int capacity) {
        graph[u].add(new Edge(v, graph[v].size(), capacity));
        graph[v].add(new Edge(u, graph[u].size() - 1, 0));
    }

    static boolean bfs() {
        Arrays.fill(level, -1);
        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        level[source] = 0;
        while (!queue.isEmpty()) {
            int v = queue.poll();
            for (Edge e : graph[v]) {
                if (e.capacity > 0 && level[e.to] == -1) {
                    level[e.to] = level[v] + 1;
                    queue.add(e.to);
                }
            }
        }
        return level[sink] != -1;
    }

    static int dfs(int v, int flow) {
        if (v == sink || flow == 0)
            return flow;
        for (; ptr[v] < graph[v].size(); ptr[v]++) {
            Edge e = graph[v].get(ptr[v]);
            if (level[e.to] == level[v] + 1 && e.capacity > 0) {
                int pushed = dfs(e.to, Math.min(flow, e.capacity));
                if (pushed > 0) {
                    e.capacity -= pushed;
                    graph[e.to].get(e.rev).capacity += pushed;
                    return pushed;
                }
            }
        }
        return 0;
    }

    static int maxFlow() {
        int flow = 0;
        while (bfs()) {
            ptr = new int[nodeCount * 2];
            int pushed;
            while ((pushed = dfs(source, INF)) > 0) {
                flow += pushed;
            }
        }
        return flow;
    }

    static boolean isAdjacent(int x1, int y1, int x2, int y2) {
        for (int dir = 0; dir < 4; dir++) {
            int nx = x1 + dx[dir];
            int ny = y1 + dy[dir];
            if (nx == x2 && ny == y2)
                return true;
        }
        return false;
    }

    static boolean reachable(int kx, int ky, int hx, int hy) {
        boolean[][] visited = new boolean[N][M];
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{kx, ky});
        visited[kx][ky] = true;
        while (!queue.isEmpty()) {
            int[] pos = queue.poll();
            if (pos[0] == hx && pos[1] == hy)
                return true;
            for (int dir = 0; dir < 4; dir++) {
                int nx = pos[0] + dx[dir];
                int ny = pos[1] + dy[dir];
                if (nx >= 0 && nx < N && ny >= 0 && ny < M) {
                    if (!visited[nx][ny] && grid[nx][ny] != '#') {
                        visited[nx][ny] = true;
                        queue.add(new int[]{nx, ny});
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        grid = new char[N][];
        cellId = new int[N][M];
        int kx = -1, ky = -1, hx = -1, hy = -1;
        nodeCount = 0;

        for (int i = 0; i < N; i++) {
            grid[i] = br.readLine().toCharArray();
            for (int j = 0; j < M; j++) {
                if (grid[i][j] != '#') {
                    cellId[i][j] = nodeCount++;
                    if (grid[i][j] == 'K') {
                        kx = i;
                        ky = j;
                    }
                    if (grid[i][j] == 'H') {
                        hx = i;
                        hy = j;
                    }
                } else {
                    cellId[i][j] = -1;
                }
            }
        }

        if (isAdjacent(kx, ky, hx, hy)) {
            bw.write("-1\n");
            bw.flush();
            return;
        }

        if (!reachable(kx, ky, hx, hy)) {
            bw.write("0\n");
            bw.flush();
            return;
        }

        int maxNodes = nodeCount * 2;
        graph = new ArrayList[maxNodes];
        for (int i = 0; i < maxNodes; i++) {
            graph[i] = new ArrayList<>();
        }
        level = new int[maxNodes];

        source = cellId[kx][ky] * 2 + 1;
        sink = cellId[hx][hy] * 2;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (cellId[i][j] != -1) {
                    int inNode = cellId[i][j] * 2;
                    int outNode = inNode + 1;
                    int capacity = (grid[i][j] == 'K' || grid[i][j] == 'H') ? INF : 1;
                    addEdge(inNode, outNode, capacity);

                    for (int dir = 0; dir < 4; dir++) {
                        int nx = i + dx[dir];
                        int ny = j + dy[dir];
                        if (nx >= 0 && nx < N && ny >= 0 && ny < M && cellId[nx][ny] != -1) {
                            int neighborInNode = cellId[nx][ny] * 2;
                            addEdge(outNode, neighborInNode, INF);
                        }
                    }
                }
            }
        }

        int flow = maxFlow();
        bw.write(flow + "\n");
        bw.flush();
    }
}
