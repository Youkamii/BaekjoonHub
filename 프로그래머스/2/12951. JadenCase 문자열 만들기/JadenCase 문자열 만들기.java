class Solution {
    public String solution(String s) {
		String answer = "";
		char[] tmpArray = s.toCharArray(); 

		if ('a' <= tmpArray[0] && tmpArray[0] <= 'z')
			tmpArray[0] -= 32;
		for (int i = 0; i < tmpArray.length; i++){
			if (i != 0 && tmpArray[i - 1] == ' ' && 'a' <= tmpArray[i] && tmpArray[i] <= 'z')
				tmpArray[i] -= 32;
			else if (i != 0 && tmpArray[i - 1] != ' ' && 'A' <= tmpArray[i] && tmpArray[i] <= 'Z')
				tmpArray[i] += 32;
		}
		return new String(tmpArray);
    }
}
