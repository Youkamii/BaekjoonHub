import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int l = numbers.length;        
        Arrays.sort(numbers);
        
        int a = numbers[0] * numbers[1];
        int b = numbers[l - 1] *  numbers[l - 2];
        return a > b ? a : b;
    }
}