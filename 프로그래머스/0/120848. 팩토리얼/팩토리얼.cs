using System;

public class Solution {   
    public int solution(int n) {
        int factorial = 1;
        int i = 1;
        
        while(factorial <= n) {
            factorial *= ++i;
        }
        
        return i - 1;
    }
}