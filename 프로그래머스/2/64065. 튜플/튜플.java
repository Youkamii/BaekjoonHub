import java.util.*;
class Solution {
    public int[] solution(String s) {
         Map<String,Integer> myMap = new HashMap<>();
		String[] tuples = s.replaceAll("[{}]", " ").trim().split(" , ");

		for (String tuple : tuples) {
			for (String num : tuple.split(","))
				myMap.put(num, myMap.getOrDefault(num, 0) + 1);
		}

		int[] answer = new int[myMap.size()];

		for (String key : myMap.keySet())
			answer[myMap.size() - myMap.get(key)] = Integer.parseInt(key);

		return answer;    
    }
}