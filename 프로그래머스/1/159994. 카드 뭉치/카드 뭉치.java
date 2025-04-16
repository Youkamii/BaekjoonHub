import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> deck1 = new LinkedList<>(Arrays.asList(cards1));
        Queue<String> deck2 = new LinkedList<>(Arrays.asList(cards2));
        
        for (String word : goal) {
            if (!deck1.isEmpty() && deck1.peek().equals(word))
                deck1.poll();
            else if (!deck2.isEmpty() && deck2.peek().equals(word))
                deck2.poll();
            else
                return "No";
        }

        return "Yes";
    }
}