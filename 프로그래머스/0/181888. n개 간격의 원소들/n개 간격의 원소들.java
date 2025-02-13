class Solution {
    public int[] solution(int[] nl, int n) {        
        int l = nl.length;
        int[] answer = new int[l % n == 0 ? l / n : l / n + 1]; //(l + n - 1) / n
        
        int j = 0;
        for (int i = 0; i < answer.length; i++) {
            answer[i] = nl[j];
            j += n;
        }
        
        return answer;
    }
}