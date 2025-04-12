import java.util.*;

class Solution
{
    public int solution(String s)
    {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            
            if (!stack.isEmpty() && stack.peek() == cur)
                stack.pop();  
            else stack.push(cur);    
        }
        
        return stack.isEmpty() ? 1 : 0;
    }
}