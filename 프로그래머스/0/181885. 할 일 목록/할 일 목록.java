import java.util.*;

class Solution {
    public String[] solution(String[] tdl, boolean[] fs) {
        List<String> answer = new ArrayList<>();
        
        for (int i = 0; i < tdl.length; i++)
            if (!fs[i]) answer.add(tdl[i]);        
        
        return answer.stream().toArray(String[]::new);
    }
}