import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] dl) {
        List<Integer> answer = new ArrayList<>();
        Set<Integer> sd = new HashSet<>();
        for (int i : dl) sd.add(i);
        
        for (int i : arr)
            if (!sd.contains(i)) answer.add(i);
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}