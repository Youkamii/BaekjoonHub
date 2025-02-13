class Solution {
    public int[] solution(int[] nl, int n) {
        int l = nl.length;
        int[] answer = new int[l - n + 1];
        
        for (int i = n - 1; i < l; i++)
            answer[i + 1 - n] = nl[i];
        
        return answer;
    }
}