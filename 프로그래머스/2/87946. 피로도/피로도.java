class Solution {
    int answer = -1;
    boolean[] visited;
    public int solution(int k, int[][] dg) {
        visited = new boolean[dg.length];
        dfs(0, k, dg);
        return answer;
    }
    
    void dfs (int dp, int k, int[][] dg) {
        if (dp > answer) answer = dp;
        for (int i = 0; i < dg.length; i++) {
            if (!visited[i] && k >= dg[i][0]) {
                visited[i] = true;
                dfs(dp + 1, k - dg[i][1], dg);
                visited[i] = false;
            }
        }
    }
} 
