class Solution {
    public int solution(String word) {
        int[] intArray = new int[5];
		char[] tmp = word.toCharArray();
		int answer;

		for (int i = 0; i < tmp.length; i++) {
			switch (tmp[i]) {
				case 'A':
					intArray[i] = 0;
					break;
				case 'E':
					intArray[i] = 1;
					break;
				case 'I':
					intArray[i] = 2;
					break;
				case 'O':
					intArray[i] = 3;
					break;
				case 'U':
					intArray[i] = 4;
					break;
			}
		}

		answer = intArray[0] * 781 + intArray[1] * 156 + intArray[2] * 31 + intArray[3] * 6 + intArray[4];

		for(char c : tmp) answer++;

		return answer;
    }
}