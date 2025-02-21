class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int ten = 1;
        while (chicken-- > 0) {
            if (ten++ == 10) {
                chicken++;
                answer++;
                ten -= 10;
            }
        }
        return answer;
    }
}