import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
         
        Stack<Integer> stack = new Stack<>();
        
        for (int hook : moves) {
            int doll = crane(board, hook - 1);
  
            if (doll != 0) {
                if(stack.isEmpty())
                    stack.add(doll);
                else {
                    int top = stack.pop();
                    if(doll == top) {
                        answer += 2;
                    } else {
                        stack.add(top);
                        stack.add(doll);
                    } 
                }
            }
        }        
        return answer;
    }
    
    public int crane(int[][] board, int x) {
        for (int y = 0; y < board.length; y++) {
            if(board[y][x] != 0) {
                int doll = board[y][x];
                board[y][x] = 0;
                return doll;
            }
        }
        return 0;
    }
}