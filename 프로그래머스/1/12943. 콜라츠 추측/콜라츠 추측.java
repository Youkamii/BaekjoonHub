class Solution {
    public int solution(int n) {
        long num = n;
        if (num == 1) return 0;
        for (int i = 0; i < 500; i++) {
            if (num % 2 == 0)
                num /= 2;
            else
                num = num * 3 + 1;
            
            if (num == 1) return i + 1;
        }
        
        return -1;
        

        
    }
}