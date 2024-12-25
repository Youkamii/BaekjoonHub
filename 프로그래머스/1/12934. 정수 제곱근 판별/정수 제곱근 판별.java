import java.util.*;

class Solution {
    public long solution(long n) {
        long sqrt = (long) Math.sqrt(n);
        return sqrt * sqrt == n ? (sqrt + 1) * (sqrt + 1) : - 1;
    }
}