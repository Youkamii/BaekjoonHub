import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        List<String> answer = new ArrayList<>();
        
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l"))
                return answer.toArray(new String[0]);
            else if (str_list[i].equals("r")) {
                answer = new ArrayList<>();                
                for (int j = i + 1; j < str_list.length; j++)
                    answer.add(str_list[j]);
                return answer.toArray(new String[0]);
            }
            answer.add(str_list[i]);
        }
        
        return new String[]{};
    }
}