import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] sa = {"aya", "ye", "woo", "ma"};
        
        for (String b : babbling) {
            for (String s : sa) b = b.replaceAll(s, " ");
            b = b.replaceAll(" ", "");
            if (b.isEmpty()) answer++;
        }
        
        return answer;
    }
}
