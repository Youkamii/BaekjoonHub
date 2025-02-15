class Solution {
    public int solution(int[] n) {
        int a = 1;
        int b = 0;
        
        for (int i : n) {
            a *= i;
            b += i;
        }
        
        b *= b;
        
        return a > b ? 0 : 1;
    }
}