class Solution {
    public int solution(int[] nl) {
        int answer = 1;
        int l = nl.length;
        
        for (int i = 0; i < l; i++) {
            if (l > 10) answer += nl[i];
            else answer *= nl[i];
        }        
        
        return l > 10 ? answer - 1 : answer;
    }
}