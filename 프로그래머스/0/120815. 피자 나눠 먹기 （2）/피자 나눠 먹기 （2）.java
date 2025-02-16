class Solution {
    
    // public static int gcd (int a, int b) {
    //     if (b == 0)
    //         return a;
    //     else
    //         return gcd (b, a % b);
    // }
    
    public int solution(int n) {
        
        for (int i = 1; i < 100; i++)
            if (i * 6 % n == 0) return i;
        
        return -1;
    }
}