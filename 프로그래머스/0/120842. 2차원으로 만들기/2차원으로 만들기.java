class Solution {
    public int[][] solution(int[] nl, int n) {
        int l = nl.length / n;
        int[][] answer = new int[l][n];

        int k = 0;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < n; j++) 
                answer[i][j] = nl[k++];
        }

        return answer;
    }
}
