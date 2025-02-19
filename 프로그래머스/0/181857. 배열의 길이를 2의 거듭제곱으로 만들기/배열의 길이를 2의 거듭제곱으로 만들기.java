import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int l = arr.length;
        int l2 = 1;
        
        while (l2 < l) l2 *= 2;
        if (l == l2) return arr;
        
        int[] answer = new int[l2];
        for (int i = 0; i < l; i++) answer[i] = arr[i];
        
        return answer;
    }
}