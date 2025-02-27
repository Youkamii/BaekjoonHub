class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int l = board.length;
        boolean[][] isSafe = new boolean[l][l];
        
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                boolean B = board[i][j] == 1 ? true : false;
                if (B) {
                    isSafe[i][j] = true;
                    
                    if (i > 0) {
                        isSafe[i - 1][j] = true;
                        if (j > 0)
                            isSafe[i - 1][j - 1] = true;
                        if (j < l - 1)
                            isSafe[i - 1][j + 1] = true;
                    }
                    if (i < l - 1) {
                        isSafe[i + 1][j] = true;
                        if (j > 0)
                            isSafe[i + 1][j - 1] = true;
                        if (j < l - 1)
                            isSafe[i + 1][j + 1] = true;
                    }

                    if (j > 0)
                        isSafe[i][j - 1] = true;
                    if (j < l - 1)
                        isSafe[i][j + 1] = true;
                    
                }
            }
        }
        
        for (boolean[] y : isSafe) for (boolean x : y) if(!x) answer++;        
        
        return answer;
    }
}

