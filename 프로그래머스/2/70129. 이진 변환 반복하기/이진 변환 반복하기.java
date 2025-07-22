class Solution {
    public int[] solution(String s) {
        int removeZero = 0;
		int diversionCount = 0;

		while (!s.equals("1")) {
			diversionCount++; 

			for (int i = 0; i < s.length(); i++)
				if (s.charAt(i) == '0')	removeZero++;
			
			s = s.replace("0", "");
			s = Integer.toBinaryString(s.length());
		}

		return new int[] {diversionCount, removeZero};
    }
}