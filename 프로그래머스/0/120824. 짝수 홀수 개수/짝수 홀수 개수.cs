using System;

public class Solution {
    public int[] solution(int[] num_list) {
        int a = 0;
        int b = 0;
        
        for (int i = 0; i < num_list.Length; i++) {
            if (num_list[i] % 2 == 1) a++;
            else b++;
        }        
        
        return new int[2] {b,a};
    }
}