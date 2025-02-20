import java.util.*;

class Solution {
    public List<Integer> solution(int[] arr, int k) {
        List<Integer> answer = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i]))
                answer.add(arr[i]);
            if (answer.size() == k)
                break;
            set.add(arr[i]);
        }
        while (answer.size() < k)
            answer.add(-1);
        
        return answer;
    }
}