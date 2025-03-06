using System;

public class Solution {
    public double solution(int[] arr) {
        double sum = 0;         
        foreach (int num in arr)
            sum += num;
        return sum / arr.Length;
    }
}
