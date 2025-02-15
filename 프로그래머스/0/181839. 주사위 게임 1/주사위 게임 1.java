class Solution {
    public int solution(int a, int b) {
        if (a % 2 == 1 && b % 2 == 1)
            return a * a + b * b;
        else if (a % 2 == 1 || b % 2 == 1)
            return (a + b) * 2;
        else
            return a > b ? a - b : b - a;        
    }
}