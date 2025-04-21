import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        Set<String> set = new HashSet<>();

        for (int i = 0; i < words.length; i++) {
            if (set.contains(words[i]) ||
                (i > 0 && !words[i].startsWith(words[i - 1].substring(words[i - 1].length() - 1)))) {
                
                int p = (i % n) + 1;
                int t = (i / n) + 1;
                return new int[]{p, t};
            }

            set.add(words[i]);
        }

        return new int[]{0, 0};
    }
}
