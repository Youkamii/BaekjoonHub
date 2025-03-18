
import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Map<String, User> user = new HashMap<>();
		int[] answer = new int[id_list.length];

		for (String s : id_list) {
			User nullList = new User();
			user.put(s, nullList);
		}
        
		for (String s : report) {
			String[] reporting = s.split(" ");

			String reporte_R_Id = reporting[0];
			String reporte_D_Id = reporting[1];

			User reporter = user.get(reporte_R_Id);
			User reported = user.get(reporte_D_Id);

			if (!reporter.reportUser.contains(reporte_D_Id)) {
				reporter.reportUser.add(reporte_D_Id);
				reported.whoReportMe.add(reporte_R_Id);
			}
		}

		for (int i = 0; i < answer.length; i++) {
			User mailedUser = user.get(id_list[i]);

			for (String reportedId : mailedUser.reportUser) {
				User reported = user.get(reportedId); 

				if (reported.whoReportMe.size() >= k)
					answer[i]++;
			}
		}
		return answer;
    }
    
    class User {
		List<String> reportUser;
		List<String> whoReportMe;

    	public User() {
			this.reportUser = new ArrayList<>();
			this.whoReportMe = new ArrayList<>();
		}
	}
}

