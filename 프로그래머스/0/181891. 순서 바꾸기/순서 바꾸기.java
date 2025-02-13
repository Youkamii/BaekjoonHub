import java.util.*;

class Solution {
    public int[] solution(int[] nl, int n) {
        int l = nl.length;
        int[] answer = new int[l];

        for (int i = 0; i < l - n; i++) 
            answer[i] = nl[i + n];

        for (int i = 0; i < n; i++) 
            answer[l - n + i] = nl[i];

        return answer;
    }
}
