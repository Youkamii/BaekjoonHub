class Solution {
    public int solution(int[][] arr) {
        
        int l = arr.length;
        
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++)
                if (arr[i][j] != arr[j][i]) return 0;
        }
        
        return 1;
    }
}