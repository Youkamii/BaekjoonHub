import java.util.*;

class Solution {
    public int returnMinute(String s) {
		String[] parts = s.split(":");
		return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
	}
    
    public String[] solution(String[][] plans) {
       List<Plan> planList = new ArrayList<>();
		List<String> answerList = new ArrayList<>();
		Stack<Plan> pausedPlans = new Stack<>();

		// 시간 -> 분 기준으로 바꾼다.
		// 시간을 기준으로 sort
		// 1분씩 과제 시간으로 보내면서 다음 과제랑 비교
		// 1. 시계 count 올리기, 2. 진행 시간 내리기 3. 시계 count와 다음 과제 비교
		// 모든 과제 한바퀴 돌았으면
		// 반대로 내려오면서 남은 과제 이름 담기

		for (String[] p : plans) {
			planList.add(new Plan(p[0],
					returnMinute(p[1]),
					Integer.parseInt(p[2])));
		}


		planList.sort(Comparator.comparingInt(p -> p.timeInMinute));

		int currentTime = planList.get(0).timeInMinute;

//		for (int i = 0; i < planList.size() - 1; i++) {
//			while (currentTime < planList.get(i + 1).timeInMinute) {
//				planList.get(i).duration--;
//				currentTime++;
//			}
//			if (planList.get(i).duration <= 0) {
//				planList.get(i).jobDone = true;
//				answerList.add(planList.get(i).subject);
//			}
//		}
//
//		for (int i = planList.size() - 1; i >= 0; i--) {
//			if (!(planList.get(i).jobDone))
//				answerList.add(planList.get(i).subject);
//		}

		for (int i = 0; i < planList.size(); i++) {

			Plan currentPlan = planList.get(i);

			while (currentTime < currentPlan.timeInMinute) {
				if (!pausedPlans.isEmpty()) {
					Plan pausedPlan = pausedPlans.pop();
					pausedPlan.duration--;
					if (pausedPlan.duration == 0) {
						answerList.add(pausedPlan.subject);
					} else {
						pausedPlans.push(pausedPlan);
					}
				}
				currentTime++;
			}

			while (currentPlan.duration > 0 && (i == planList.size() - 1 || currentTime < planList.get(i + 1).timeInMinute)) {
				currentPlan.duration--;
				currentTime++;
			}

			if (currentPlan.duration == 0) {
				answerList.add(currentPlan.subject);
			} else {
				pausedPlans.push(currentPlan);
			}
		}


		while (!pausedPlans.isEmpty()) {
			Plan pausedPlan = pausedPlans.pop();
			answerList.add(pausedPlan.subject);
		}





		String[] answer = new String[answerList.size()];
		for (int i = 0; i < answer.length; i++)
			answer[i] = answerList.get(i);

		return answer;
	}

	class Plan {
		String subject;
		int timeInMinute;
		int duration;
		boolean jobDone;

		public Plan(String subject, int timeInMinute, int duration) {
			this.subject = subject;
			this.timeInMinute = timeInMinute;
			this.duration = duration;
			this.jobDone = false;
		}
	}
}