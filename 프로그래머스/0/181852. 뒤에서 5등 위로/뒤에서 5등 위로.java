import java.util.*;

class Solution {
    public int[] solution(int[] nl) {
        Arrays.sort(nl);
        int[] answer = new int[nl.length - 5];
        
        for (int i = 0; i < answer.length; i++) 
            answer[i] = nl[i + 5];
        
        return answer;
    }
}