import java.util.*;


class Solution {
    public int solution(int[] elements) {
        Set<Integer> answer = new HashSet<>();
		int Length = elements.length;
		int[] doubleElements = new int[Length * 2]; 

		for (int i = 0; i < Length * 2; i++)
			doubleElements[i] = elements[i % Length]; 

		for (int cases = 1; cases <= Length; cases++) {
			for (int i = 0; i < Length * 2 - cases; i++) {
				int sum = 0;
				for (int j = i; j < i + cases; j++)
					sum += doubleElements[j];				
				answer.add(sum);
			}
		}
		return answer.size();
    }
}