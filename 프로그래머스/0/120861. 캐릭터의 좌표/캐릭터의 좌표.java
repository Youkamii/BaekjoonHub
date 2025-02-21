import java.util.*;

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0 , 0};
        
        Map<String, int[]> map = new HashMap<>();
        map.put("up", new int[]{0, 1});
        map.put("down", new int[]{0, -1});
        map.put("left", new int[]{-1, 0});
        map.put("right", new int[]{1, 0});

        
        for (String key : keyinput) {
            int[] move = map.get(key);
            if (Math.abs(answer[0] + move[0]) <= Math.abs(board[0] / 2))
                answer[0] += move[0];
            if (Math.abs(answer[1] + move[1]) <= Math.abs(board[1] / 2))
                answer[1] += move[1];
        }
        
        return answer;
    }
}