class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];        
        int m = ((num % 2 == 1) ? total / num : total / num + 1) - (num / 2);
        
        for (int i = 0; i < answer.length; i++)
            answer[i] = m++;
        
        return answer;
    }
}