import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        Map<Character, Integer> tmpX = new HashMap<>();
		Map<Character, Integer> tmpY = new HashMap<>();
		List<Character> commonNumbers = new ArrayList<>();
		StringBuilder answer = new StringBuilder();

		for (char c : X.toCharArray())
			tmpX.put(c, tmpX.getOrDefault(c, 0) + 1);
		for (char c : Y.toCharArray()) 
			tmpY.put(c, tmpY.getOrDefault(c, 0) + 1);
		for (char c : tmpX.keySet()) {
			if (tmpY.containsKey(c)) {
				int min = Math.min(tmpX.get(c), tmpY.get(c));
				for (int i = 0; i < min; i++)
					commonNumbers.add(c);
			}
		}

		if (commonNumbers.isEmpty())
			return "-1";		
		Collections.sort(commonNumbers, Collections.reverseOrder());		
		for (char c : commonNumbers)
			answer.append(c);		
		return answer.toString().matches("0+") ? "0" : answer.toString();
    }
}