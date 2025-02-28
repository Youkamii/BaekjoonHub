import java.util.*;

class Solution {
    
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        Map<Integer, int[]> map = new HashMap<>();
        int tmpK = 1;
        
        int[][] p = new int[4][3];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (tmpK == 11)
                    map.put(0, new int[]{i, j});
                else if (tmpK != 10 && tmpK != 12)
                    map.put(tmpK, new int[]{i, j});                
                tmpK++;
            }
        }

        
        int[] l = new int[]{3, 0};
        int[] r = new int[]{3, 2};
        
        for (int n : numbers) {
            int[] pos = map.get(n); 

            if (n == 1 || n == 4 || n == 7) {
                l = pos;
                answer.append("L");
            } else if (n == 3 || n == 6 || n == 9) {
                r = pos;
                answer.append("R");
            } else {
                int leftDist = Math.abs(l[0] - pos[0]) + Math.abs(l[1] - pos[1]);
                int rightDist = Math.abs(r[0] - pos[0]) + Math.abs(r[1] - pos[1]);

                if (leftDist < rightDist) {
                    l = pos;
                    answer.append("L");
                } else if (leftDist > rightDist) {
                    r = pos;
                    answer.append("R");
                } else {
                    if (hand.equals("left")) {
                        l = pos;
                        answer.append("L");
                    } else {
                        r = pos;
                        answer.append("R");
                    }
                }
            }
        }

        return answer.toString();
    }
}