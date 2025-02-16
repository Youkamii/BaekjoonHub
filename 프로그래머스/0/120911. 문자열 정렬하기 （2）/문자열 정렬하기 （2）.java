import java.util.*;

class Solution {
    public String solution(String s) {
        char[] c = s.toLowerCase().toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
}