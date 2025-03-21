import java.util.*;

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int u = denom1 * numer2 + numer1 * denom2;
        int d = denom1 * denom2;
        int m = Math.min(u, d);
        
        for (int i = 2; i <= m / 2; i++) {
            while(u % i == 0 && d % i == 0) { 
                u /= i;
                d /= i;
            } 
        }
        
        return new int[] {u, d};
    }
}