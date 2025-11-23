class Solution {
    public int solution(int n) {
        
        for (int i = 1; i < 100; i++)
            if (i * 6 % n == 0) return i;
        
        return -1;
    }
}