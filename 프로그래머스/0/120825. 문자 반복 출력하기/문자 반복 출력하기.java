import java.util.*;

class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < n; j++)
                sb.append(s.charAt(i));
        }
            
        
        
        return sb.toString();
    }
}