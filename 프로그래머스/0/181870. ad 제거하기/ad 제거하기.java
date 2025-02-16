import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> answer = new ArrayList<>();
        
        for (String str : strArr)
            if (!str.contains("ad")) answer.add(str);
        
        return answer.toArray(new String[0]);
    }
}