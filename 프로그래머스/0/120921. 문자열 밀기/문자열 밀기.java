import java.util.*;

class Solution {
    public int solution(String A, String B) {
        int answer = 1;
        int sl = A.length();
        
        if (A.equals(B)) return 0;
        for (int i = 1; i < sl; i++) {
            System.out.println((A.substring(i, sl) + A.substring(0,i)));
            if (B.equals(A.substring(sl - i, sl) + A.substring(0,sl - i))) return answer;
            answer++;
        }
        return -1;
    }
}