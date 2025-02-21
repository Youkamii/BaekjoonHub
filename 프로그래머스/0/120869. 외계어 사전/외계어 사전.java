import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        Arrays.sort(spell);
        StringBuilder sb = new StringBuilder();
        for (String s : spell) sb.append(s);
        String ss = sb.toString();
        
        for (String str : dic) {
            char[] ca = str.toCharArray();
            Arrays.sort(ca);
            if (ss.equals(new String(ca))) return 1;
        }
        
        return 2;
    }
}
