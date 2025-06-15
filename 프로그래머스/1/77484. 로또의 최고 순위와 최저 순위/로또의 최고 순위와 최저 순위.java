class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zero = 0;
		int match = 0;

		for (int i : lottos) {
			if (i == 0)	zero++;
			else for (int j : win_nums) if (i == j)	match++;			
		}

		int lowRank = 7 - match;           
		int highRank = lowRank - zero;
        
        lowRank = lowRank > 6 ? 6 : lowRank;
        highRank = highRank > 6 ? 6 : highRank;

		return new int[]{highRank, lowRank};
    }
}