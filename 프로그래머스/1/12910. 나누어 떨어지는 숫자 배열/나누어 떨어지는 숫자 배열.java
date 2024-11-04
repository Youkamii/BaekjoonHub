import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer; 
		List<Integer> integerList = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % divisor == 0)
				integerList.add(arr[i]);
		}
		integerList.sort(Comparator.naturalOrder());
		answer = integerList.stream().mapToInt(i -> i).toArray();

		return (integerList.isEmpty()) ? new int[]{-1} : answer;
    }
}