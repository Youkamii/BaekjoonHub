class Solution {
    int Max = -1;
    boolean[] visited;
    
    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        dfs (0, k, dungeons);
        return Max;
    }
    
    void dfs (int count, int k, int[][] dungeons) {
        Max = Max < count ? count : Max;
        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i] && dungeons[i][0] <= k) {
                visited[i] = true;
                dfs(count + 1, k - dungeons[i][1], dungeons);
                visited[i] = false;
            }
        }
    }
}