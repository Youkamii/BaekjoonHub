class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if (n >= 1 && n <= 3)
            return 0;
        
        for (int i = 4; i <= n; i++) {
            for(int j = 2; j < i / 2 + 1; j++) {
                if (i % j == 0) {
                    answer++;
                    break;
                }
            }
        }
        
        return answer;
    }
}