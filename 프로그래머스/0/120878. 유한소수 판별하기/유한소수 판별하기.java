class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int tmpA = a;
        
        for (int i = 2; i <= a; i++) {
            if (tmpA % i == 0 && b % i == 0) {
                tmpA /= i;
                b /= i;
            }
        }
        
        while (b % 2 == 0) b /= 2;
        while (b % 5 == 0) b /= 5;
        
        return b == 1 ? 1 : 2;
    }
}