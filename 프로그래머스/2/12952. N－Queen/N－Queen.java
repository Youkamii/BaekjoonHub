import java.util.*;

class Solution {

    int answer = 0;
    boolean[][] table;

    public int solution(int n) {
        table = new boolean[n][n];
        placeQueens(0, n);
        return answer;
    }

    private void placeQueens(int row, int n) {
        if (row == n) {
            answer++;
            return;
        }
        
        for (int col = 0; col < n; col++) {
            if (checkingPossible(row, col, n)) {
                table[row][col] = true;
                placeQueens(row + 1, n);
                table[row][col] = false;
            }
        }
    }

    public boolean checkingPossible (int row, int col, int n) {

        if (!checkY(row, col, n))
            return false;
        else if(!checkD(row, col, n))
            return false;

        return true;
    }

    private boolean checkY(int row, int col, int n) {
        for (int i = 0; i < row; i++) {
            if (table[i][col]) {
                return false;
            }
        }
        return true;
    }

    private boolean checkD(int row, int col, int n) {
        for (int i = 1; i <= row; i++) {
            if (col - i >= 0 && table[row - i][col - i]) {
                return false;
            }
            if (col + i < n && table[row - i][col + i]) {
                return false;
            }
        }
        return true;
    }
}
