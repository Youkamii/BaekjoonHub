import java.util.*;

class Solution {
    public StringBuilder solution(String str) {
        StringBuilder answer = new StringBuilder();
        Set<Character> set = new HashSet<>();

        for (char c : str.toCharArray()) 
            if (set.add(c)) answer.append(c);

        return answer;
    }
}