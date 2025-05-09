import java.util.*;

class Solution {
    public StringBuilder solution(String s) {
        StringBuilder answer = new StringBuilder();
        boolean Fswitch = true;
        
        for (int i = 0; i < s.length(); i++ ) {
            char c = s.charAt(i);
            
            if (c == ' ') {
                answer.append(c); 
                Fswitch = true;
            } else {
                if (Fswitch) {
                    answer.append(Character.toUpperCase(c));
                    Fswitch = false;
                } else {
                    answer.append(Character.toLowerCase(c));
                }
            }
        }
        
        return answer;
    }
}