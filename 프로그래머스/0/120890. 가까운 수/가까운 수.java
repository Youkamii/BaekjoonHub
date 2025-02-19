import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int l = array.length - 1;
        
        Arrays.sort(array);
        for (int i = 0; i < l; i++) {
            if (array[i] <= n && array[i + 1] >= n) {
                int a = n - array[i];
                int b = array[i + 1] - n;
                if (a == b) return array[i];
                else return a > b ? array[i + 1] : array[i];
            }
        }
        
        return array[l];
    }
}