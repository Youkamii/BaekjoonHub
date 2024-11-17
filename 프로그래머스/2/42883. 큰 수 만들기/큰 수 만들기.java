import java.util.*;

class Solution {
    public String solution(String number, int k) {
        Stack<Character> stack = new Stack<>();
		StringBuilder answer = new StringBuilder();

		for (int i = 0; i < number.length(); i++) {
			char c = number.charAt(i);
			while (!stack.isEmpty() && stack.peek() < c && k > 0) {
				stack.pop();
				k--; 
			}
			stack.push(c);
		}

		while (!stack.isEmpty())
			answer.append(stack.pop());
		answer.reverse();
        
        if (k != 0)
			answer.setLength(answer.length() - k);

		return answer.toString();
    }
}