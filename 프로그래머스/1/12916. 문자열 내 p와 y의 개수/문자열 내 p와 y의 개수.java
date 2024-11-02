class Solution {
    boolean solution(String s) {
        int pH = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'p' || s.charAt(i) == 'P')
				pH++;
			else if (s.charAt(i) == 'y' || s.charAt(i) == 'Y')
				pH--;
		}
		return (pH == 0) ? true : false;
    }
}