import java.util.*;

class Solution {
    public int solution(int[] array) {
        int[][] answer = new int[1000][2];
        
        for (int i = 0; i < 1000; i++) {
            answer[i][0] = i;
            answer[i][1] = 0;
        }
        
        for (int i : array)
            answer[i][1]++;        
        
        Arrays.sort(answer, (a, b) -> b[1] - a[1]);
        
        return answer[0][1] == answer[1][1] ? -1 : answer[0][0];
    }
}