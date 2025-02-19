import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < my_str.length(); i += n) 
            answer.add(my_str.substring(i, Math.min(i + n, my_str.length())));        
        
        return answer.toArray(new String[0]);
    }
}