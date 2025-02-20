import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;

        while (i < arr.length) {
            while (!stack.isEmpty() && stack.peek() >= arr[i])
                stack.pop();
            stack.push(arr[i]);
            i++;
        }

        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}
