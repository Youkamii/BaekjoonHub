using System;

public class Solution {
    public int solution(int[] num_list) {
        int H = 0;
        int J = 0;
        
        for (int i = 0; i < num_list.Length; i++) {
            if (i % 2 == 1)
                H += num_list[i];
            else
                J += num_list[i];
        }
        
        return (H > J) ? H : J;
    }
}