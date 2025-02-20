import java.util.*;

class Solution {
    public int solution(String my_string) {
        StringTokenizer st = new StringTokenizer(my_string);
        int answer = Integer.parseInt(st.nextToken());
        
        while(st.hasMoreTokens()) {
            String s = st.nextToken();
            
            if (s.equals("+"))
                answer += Integer.parseInt(st.nextToken());
            else
                answer -= Integer.parseInt(st.nextToken());
        }
        
        return answer;
    }
}