import java.util.*;

class Solution {
    public StringBuilder solution(String[] s, int[][] p) {
        StringBuilder sb = new StringBuilder();        
        for (int i = 0; i < s.length; i++) sb.append(s[i].substring(p[i][0], p[i][1] + 1));    
        
        return sb;
    }
}