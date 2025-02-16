import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] it) {
        List<Integer> answer = new ArrayList<>();
        for (int i = it[0][0]; i <= it[0][1]; i++)
            answer.add(arr[i]);
        for (int i = it[1][0]; i <= it[1][1]; i++)
            answer.add(arr[i]);
        return answer.stream().mapToInt(i -> i).toArray();
    }
}