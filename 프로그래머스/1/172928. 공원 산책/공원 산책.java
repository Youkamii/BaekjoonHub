import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        String[][] map = new String[park.length][park[0].length()];
 
		int[] whereIsMyDoggy = new int[2];

		for (int i = 0; i < park.length; i++) {
			map[i] = park[i].split("");
			for (int j = 0; j < map[i].length; j++)
				if (Objects.equals(map[i][j], "S")) whereIsMyDoggy = new int[]{i, j};			
		}

		for (String s : routes) {
			String[] order = s.split(" ");
			String direction = order[0];
			int distance = Integer.parseInt(order[1]);


			if (canITMove(direction, whereIsMyDoggy, map, distance)) {
				while (distance > 0) {
					switch (direction) {
						case "E" -> whereIsMyDoggy[1]++;
						case "W" -> whereIsMyDoggy[1]--;
						case "N" -> whereIsMyDoggy[0]--;
						case "S" -> whereIsMyDoggy[0]++;
					}
					distance--;
				}
			}
		}
		return whereIsMyDoggy;
	}
    
	public boolean canITMove(String direction, int[] whereIsMyDoggy, String[][] map, int distance) {
        int currentY = whereIsMyDoggy[0];
        int currentX = whereIsMyDoggy[1];

        switch (direction) {
                case "E":
                    for (int i = 1; i <= distance; i++) {
                        if (currentX + i >= map[0].length || Objects.equals(map[currentY][currentX + i], "X"))
                            return false;
                    }
                    break;
                case "W":
                    for (int i = 1; i <= distance; i++) {
                        if (currentX - i < 0 || Objects.equals(map[currentY][currentX - i], "X"))
                            return false;
                    }
                    break;
                case "N":
                    for (int i = 1; i <= distance; i++) {
                        if (currentY - i < 0 || Objects.equals(map[currentY - i][currentX], "X"))
                            return false;
                    }
                    break;
                case "S":
                    for (int i = 1; i <= distance; i++) {
                        if (currentY + i >= map.length || Objects.equals(map[currentY + i][currentX], "X"))
                            return false;
                    }
                    break;
            }

        return true;
    }



}