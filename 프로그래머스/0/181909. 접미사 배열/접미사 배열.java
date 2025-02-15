import java.util.*;

class Solution {
    public String[] solution(String s) {
        int l = s.length();
        List<String> answer = new ArrayList<>();
        
        for (int i = 0; i < l; i++)  
            answer.add(s.substring(i, l));

        String[] arrAns = answer.toArray(new String[0]);
        Arrays.sort(arrAns);
        
        return arrAns;
    }
}
