import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {       
        int[] answer = new int[targets.length];
        Map<Character, Integer> typeBoard = new HashMap<>();
         
        for (int k = 0; k < keymap.length; k++) {           
            String key = keymap[k];     
            
            for (int i = 0; i < key.length(); i++) {
                char c = key.charAt(i);
                
                if (!typeBoard.containsKey(c) || typeBoard.get(c) > i +1) {
                    typeBoard.put(c, i + 1);
                }
            }
        }
        
        for (int k = 0; k < targets.length; k++) {           
            String t = targets[k];         
            int count = 0;
            
            for (int i = 0; i < t.length(); i++) {
                char c = t.charAt(i);
                
                if (!typeBoard.containsKey(c)) {
                    count = -1;
                    break;
                } else {
                    count += typeBoard.get(c);
                }
            
            }
            answer[k] = count;
        }
        return answer;
    }            
}