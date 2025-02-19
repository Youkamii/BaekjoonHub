import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        
        while(i < arr.length) {
            if (stack.isEmpty()) 
                stack.push(arr[i++]);
            else if (!stack.isEmpty()) {
                int sp = stack.peek();
                int ci = arr[i++];
                
                if (sp == ci) stack.pop();
                else stack.push(ci);
            }            
        }
        
        return stack.isEmpty() ? new int[]{-1} : stack.stream().mapToInt(Integer::intValue).toArray();
    }
}