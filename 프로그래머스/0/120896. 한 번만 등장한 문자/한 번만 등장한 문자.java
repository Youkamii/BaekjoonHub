import java.util.*;

class Solution {
    public StringBuilder solution(String s) {
        Map<Character, Integer> map = new HashMap<>();
        List<Character> list = new ArrayList<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);            
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : map.keySet())
            if(map.get(c) == 1) list.add(c);
        
        Collections.sort(list);
        
        StringBuilder sb = new StringBuilder();
        for (char c : list) sb.append(c);
        
        return sb;
    }
}