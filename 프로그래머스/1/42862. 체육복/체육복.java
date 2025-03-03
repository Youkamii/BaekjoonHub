import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] spare = new int[n];
		int answer = 0;

		for (int i : lost)
			spare[i - 1]--;
		for (int i : reserve)
			spare[i - 1]++; 

		for (int i = 0; i < spare.length; i++) {
			if (spare[i] == -1) {
				if (i > 0 && spare[i - 1] == 1) {
					spare[i]++;
					spare[i - 1]--;
				} else if (i < spare.length - 1 && spare[i + 1] == 1) {
					spare[i]++;
					spare[i + 1]--;
				}
			}
		}
		
		for (int i : spare) if (i >= 0) answer++;        
		return answer;
    }
}