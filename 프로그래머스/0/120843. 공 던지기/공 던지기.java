class Solution {
    public int solution(int[] numbers, int k) {
        int l = numbers.length;
        int answer = 1;
        for (int i = 0; i < k - 1; i++) {
            answer += 2;
            if (answer > l)
                answer = answer - l;
        }
        return answer;
        
    }
}