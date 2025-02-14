class Solution {
    public int[] solution(int s, int e) {
        int l = s - e + 1;
        int[] answer = new int[l];
        
        for (int i = 0; i < l; i++)
            answer[i] = s - i;
        
        return answer;
    }
}