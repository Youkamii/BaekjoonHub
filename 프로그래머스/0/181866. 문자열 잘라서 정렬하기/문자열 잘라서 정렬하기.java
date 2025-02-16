import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] str = myString.split("x+");
        List<String> list = new ArrayList<>();
        
        for (String s : str) 
            if (!s.isEmpty()) list.add(s);
        
        String[] answer = list.toArray(new String[0]);
        Arrays.sort(answer);
        
        return answer;
    }
}