class Solution {
    int answer = -1;
    boolean[] visited;
    
    public int solution(int k, int[][] dgs) {
        visited = new boolean[dgs.length];     
        dfs(0, k, dgs);
        return answer;
    }
    
    void dfs (int count, int k, int[][] dgs) {
        if (count > answer) answer = count;
        for (int i = 0; i < dgs.length; i++) {
            if (dgs[i][0] <= k && !visited[i]) {
                visited[i] = true;
                dfs(count + 1, k - dgs[i][1], dgs);
                visited[i] = false;
            }
        }
    }
}