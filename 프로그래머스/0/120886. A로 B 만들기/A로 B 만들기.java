import java.util.*;

class Solution {
    public int solution(String b, String a) {
//         Map<Character, Integer> bm = new HashMap<>();
//         Map<Character, Integer> am = new HashMap<>();
        
//         for (int i = 0; i < b.length(); i++) {
//             char bc = b.charAt(i);
//             char ac = a.charAt(i);
            
//             bm.put(bc, bm.getOrDefault(bc, 0) + 1);
//             am.put(ac, am.getOrDefault(ac, 0) + 1);
//         }
        
        
//         return bm.equals(am) ? 1 : 0;
        int[] zeroSum = new int[26];
        
        for (int i = 0; i < b.length(); i++) {
            zeroSum[b.charAt(i) - 'a']++;
            zeroSum[a.charAt(i) - 'a']--;             
        }
        
        return Arrays.equals(zeroSum, new int[26]) ? 1 : 0;

    }
}