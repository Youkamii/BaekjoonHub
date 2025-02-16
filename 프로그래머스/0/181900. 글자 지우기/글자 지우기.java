import java.util.*;

class Solution {
    public StringBuilder solution(String my_string, int[] indices) {
        StringBuilder answer = new StringBuilder();
        
        Arrays.sort(indices);
        
        int j = 0;
        for (int i = 0; i < my_string.length(); i++) {
            if (j < indices.length && i == indices[j]) j++;
            else answer.append(my_string.charAt(i));
        }
        
        return answer;
    }
}