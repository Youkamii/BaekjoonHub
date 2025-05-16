class Solution {
    int answer = 0;
    boolean[] visited;
    
    public int solution(int k, int[][] dgs) {
        visited = new boolean[dgs.length];
        dfs(k, 0, dgs);
        return answer;
    }
    
    void dfs (int k, int depth, int[][] dps) {
        if (depth > answer) answer = depth;
        for (int i = 0; i < dps.length; i ++) {
            if (!visited[i] && k >= dps[i][0]) {
                visited[i] = true;
                dfs(k - dps[i][1], depth + 1, dps);
                visited[i] = false;
            }
        }
    }
}