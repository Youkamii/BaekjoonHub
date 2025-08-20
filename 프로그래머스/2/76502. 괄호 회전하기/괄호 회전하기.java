import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        for (int i = 0; i < s.length(); i++)
            if (rolling(s, i)) answer++;
        return answer;
    }

    public boolean rolling(String s, int i) {
        Stack<Character> stack = new Stack<>();
        char[] tmpArray = (s.substring(i + 1) + s.substring(0, i + 1)).toCharArray();

        for (char c : tmpArray) {
            if (c == '(' || c == '{' || c == '[')
                stack.push(c);
            else if (c == ')' && !stack.isEmpty() && stack.peek() == '(')
                stack.pop();
            else if (c == '}' && !stack.isEmpty() && stack.peek() == '{')
                stack.pop();
            else if (c == ']' && !stack.isEmpty() && stack.peek() == '[')
                stack.pop();
            else
                return false;
        }
        return stack.isEmpty();
    }
}
