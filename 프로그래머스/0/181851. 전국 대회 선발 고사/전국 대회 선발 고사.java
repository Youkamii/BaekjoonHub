import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < rank.length; i++)
            if (attendance[i]) map.put(i, rank[i]);
        
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());      

        return 10000 * list.get(0).getKey() + 100 * list.get(1).getKey() + list.get(2).getKey();
    }
}