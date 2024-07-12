import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answerList = new ArrayList<>();
		int[] jobDone = new int[progresses.length];

		for (int i = 0; i < progresses.length; i++)
			jobDone[i] = ((100 - progresses[i] - 1) / speeds[i] + 1);

		int count = 1;
		int longestDay = jobDone[0];

		for (int i = 1; i < jobDone.length; i++) {
			if (longestDay >= jobDone[i])
				count++;
			else {
				answerList.add(count);
				count = 1;
				longestDay = jobDone[i];
			}
		}

		answerList.add(count);

		int[] answer = new int[answerList.size()];

		for (int i = 0; i < answer.length; i++) {
			answer[i] = answerList.get(i);
        }

		return answer;
    }
}