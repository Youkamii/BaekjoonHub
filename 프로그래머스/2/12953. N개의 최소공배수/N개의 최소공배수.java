import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];

		for (int i = 1; i < arr.length; i ++)
			answer = euclidean86 (answer, arr[i]);	

		return answer;
	}

	public int euclidean86(int answer, int next) {
		long lcm = answer * next;
		int tmp = 1;
		
		while ( tmp > 0 ) {
			tmp = answer % next;
			answer = next;
			next = tmp;
		}
		
		return (int)lcm / answer;
	}
    
}