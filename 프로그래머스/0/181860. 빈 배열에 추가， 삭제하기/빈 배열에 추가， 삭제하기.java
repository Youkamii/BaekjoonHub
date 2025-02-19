import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        Stack<Integer> answer = new Stack<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) 
                for (int j = 0; j < arr[i] * 2; j++) answer.push(arr[i]);
            else
                for (int j = 0; j < arr[i]; j++) answer.pop();
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}