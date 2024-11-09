import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
		Map<Integer, Integer> tangerineSize = new HashMap<>();
		for (int size : tangerine)
			tangerineSize.put(size, tangerineSize.getOrDefault(size, 0) + 1);

		List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(tangerineSize.entrySet());

		entries.sort((a, b) -> b.getValue().compareTo(a.getValue()));
 
		int box = 0;
		for (Map.Entry<Integer, Integer> entry : entries) {
			if (box >= k) break;
			box += entry.getValue();
			answer++;
		} 

		return answer;
    }
}