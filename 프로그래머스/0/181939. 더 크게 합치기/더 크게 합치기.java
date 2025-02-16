import java.util.*;

class Solution {
    public int solution(int a, int b) {
        int r = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int l = Integer.parseInt(Integer.toString(b) + Integer.toString(a));
        return Math.max(r, l);
    }
}