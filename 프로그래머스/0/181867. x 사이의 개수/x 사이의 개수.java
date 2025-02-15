import java.util.*;

class Solution {
    public int[] solution(String myString) {
        String[] str = myString.split("x");
        
        List<Integer> answer = new ArrayList<>();
        for (String s : str) answer.add(s.length());
        if (myString.endsWith("x")) answer.add(0);           
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}