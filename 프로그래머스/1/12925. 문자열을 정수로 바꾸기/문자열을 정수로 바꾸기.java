class Solution {
    public int solution(String s) {
        int answer = 0;
		boolean flag = false;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '+') 
				continue;
			else if (s.charAt(i) == '-') {
				flag = true; 
				continue;  
			} 
			answer = answer * 10 + s.charAt(i) - 48;
		}
        
		return flag ? answer * -1 : answer;
    }
}