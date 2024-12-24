import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = n + "";
        
        for (int i = 0; i < str.length(); i++) {
            answer += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        
        return answer;
    }
}