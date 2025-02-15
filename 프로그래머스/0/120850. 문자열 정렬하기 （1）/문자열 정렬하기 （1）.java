import java.util.*;

class Solution {
    public int[] solution(String s) {
        List<Integer> answer = new ArrayList<>();
        
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c))
                answer.add(c - 48);
        }
        
        int[] ans = answer.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(ans);
        
        return ans;
    }
}

