import java.util.*;

class Solution {
    public int[] solution(int[] n) {
        int l = n.length;
        int last = n[l - 1];
        int prev = n[l - 2];
        int newElement = last > prev ? last - prev : last * 2;
        
        int[] answer = Arrays.copyOf(n, l + 1);
        answer[l] = newElement;
        
        return answer;
    }
}
