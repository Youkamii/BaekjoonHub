import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String bnrN2Str = Integer.toBinaryString(n);

        for (int i = 0; i < bnrN2Str.length(); i++)
            if(bnrN2Str.charAt(i) == '1') answer++;        
        
        return answer;
    }
}