import java.util.*;

class Solution {
    public int[] solution(long n) {
        List<Integer> answer = new ArrayList<>();
        String str = String.valueOf(n);
        
        for (int i = str.length() - 1; i >= 0; i--) {
            answer.add(Character.getNumericValue(str.charAt(i)));
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
