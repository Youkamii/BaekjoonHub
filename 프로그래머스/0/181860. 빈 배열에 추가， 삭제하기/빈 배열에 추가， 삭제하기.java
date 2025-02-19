import java.util.*;

class Solution {
    public Stack<Integer> solution(int[] arr, boolean[] flag) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) for (int j = 0; j < arr[i] * (flag[i] ? 2 : 1); j++) if (flag[i]) stack.push(arr[i]); else stack.pop();            
        
        return stack;
    }
}