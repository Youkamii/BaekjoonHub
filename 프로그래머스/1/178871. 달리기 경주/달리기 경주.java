import java.util.*;


class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> playerRanks = new HashMap<>();
		String tmpName;
		int tmpRank; 

		for (int i = 0; i < players.length; i++)
			playerRanks.put(players[i], i);
 
		for (String name : callings) {
			tmpRank = playerRanks.get(name);
			tmpName = players[tmpRank - 1];

			players[tmpRank - 1] = name;
			players[tmpRank] = tmpName;

			playerRanks.put(name, tmpRank - 1);
			playerRanks.put(tmpName, tmpRank);
		}

		return players;
    }
}