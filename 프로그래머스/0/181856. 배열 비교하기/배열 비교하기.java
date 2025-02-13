import java.util.*;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int a1 = arr1.length;
        int a2 = arr2.length;
        
        if (a1 == a2) {
            int a1s = 0, a2s = 0;
            
            for (int i = 0; i < a1; i++) {
                a1s += arr1[i];
                a2s += arr2[i];
            }
            
            if (a1s == a2s)
                return 0;
            return a1s > a2s ? 1 : -1;
        } else
            return a1 > a2 ? 1 : -1;
        
    }
}