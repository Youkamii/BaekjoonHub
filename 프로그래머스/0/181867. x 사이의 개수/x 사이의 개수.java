import java.util.*;

class Solution {
    public int[] solution(String myString) {
        String[] str = myString.split("x", -1);
        
        List<Integer> answer = new ArrayList<>();
        for (String s : str) answer.add(s.length());        
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}