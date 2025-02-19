class Solution {
    public int solution(int[] nl) {
        int answer = 0;
        
        for (int i = 0; i < nl.length; i++) {
            int tmp = nl[i];
            
            while (tmp > 1) {
                if (tmp % 2 == 0) {
                    tmp /= 2;
                    answer++;
                } else tmp--;                
            }
            
            nl[i] = tmp;
        }
        
        return answer;
    }
}