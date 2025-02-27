import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] dice = {a, b, c, d};
        Arrays.sort(dice);
        
        if (dice[0] == dice[3]) 
            return 1111 * dice[0];
        
        if (dice[0] == dice[2]) 
            return (int) Math.pow(10 * dice[0] + dice[3], 2);
        
        if (dice[1] == dice[3]) 
            return (int) Math.pow(10 * dice[1] + dice[0], 2);

        if (dice[0] == dice[1] && dice[2] == dice[3]) 
            return (dice[0] + dice[2]) * Math.abs(dice[0] - dice[2]);

        if (dice[0] == dice[1]) return dice[2] * dice[3];
        if (dice[1] == dice[2]) return dice[0] * dice[3];
        if (dice[2] == dice[3]) return dice[0] * dice[1];

        return dice[0];
    }
}
