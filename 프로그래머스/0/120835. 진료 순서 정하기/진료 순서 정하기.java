import java.util.*;
class Solution {
    public int[] solution(int[] em) {
        int[] answer = em.clone();        
        Arrays.sort(answer);
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < em.length; i++)
            map.put(answer[i], em.length - i);

        for (int i = 0; i < em.length; i++)
            answer[i] = map.get(em[i]);
        
        return answer;
    }
}