import java.util.*;

class Solution {
    public List<String> solution(String[] picture, int k) {
        List<String> list = new ArrayList<>();
        for (String str : picture) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                for (int j = 0; j < k; j++)
                    sb.append(c);
            }
            for (int i = 0; i < k; i++)
                list.add(sb.toString());            
        }
        
        return list;
    }
}