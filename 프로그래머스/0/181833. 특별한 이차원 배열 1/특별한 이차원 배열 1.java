class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            int[] tmp = new int[n];
            
            for (int j = 0; j < n; j++) {
                if (j == i)
                    tmp[j] = 1;
                else
                    tmp[j] = 0;
            }
            
            answer[i] = tmp;
        }
        
        return answer;
    }
}