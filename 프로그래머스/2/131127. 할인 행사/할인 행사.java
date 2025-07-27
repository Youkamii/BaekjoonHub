import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        
		int answer = 0;

		Map<String, Integer> iWantIT = new HashMap<>();
		for (int i = 0; i < want.length; i++)
			iWantIT.put(want[i], number[i]); 

		for (int i = 0; i <= discount.length - 10; i++) {
			Map<String, Integer> discountSchedule = new HashMap<>();
			for (int j = i; j < i + 10; j++)
				discountSchedule.put(discount[j], discountSchedule.getOrDefault(discount[j], 0) + 1);

			Boolean 지금이니 = true;

			if (!iWantIT.equals(discountSchedule)) 지금이니 = false;
			if (지금이니) answer++;
		}

		return answer;

    }
}