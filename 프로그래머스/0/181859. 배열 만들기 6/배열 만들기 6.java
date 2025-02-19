import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int i = -1;
        
        while(++i < arr.length) {
            if (stack.isEmpty()) {
                stack.push(arr[i]);                
            } else {                
                if (stack.peek() == arr[i]) stack.pop();
                else stack.push(arr[i]);                
            }
        }        
        return stack.isEmpty() ? new int[]{-1} : stack.stream().mapToInt(Integer::intValue).toArray();
    }
}
