import java.util.*;

class Solution {
    public static int solution(int[] p, int limit) {
        int answer = 0;

        Arrays.sort(p);

        int l = 0;
        int r = p.length - 1;
        while(true) {
            if (l > r) {
                break;
            } else if (l == r) {
                answer++;
                break;
            } else if (p[l] + p[r] <= limit) {
                answer++;
                l++;
                r--;
            } else if (p[l] + p[r] > limit) {
                answer++;
                r--;
            }
        }
        return answer;
    }
}