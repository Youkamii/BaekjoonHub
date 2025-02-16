class Solution {
    public int solution(int order) {
        int answer = 0;
        
        for (char c : String.valueOf(order).toCharArray())
            if (c == '3' || c == '6' || c == '9') answer++;                
        
        return answer;
    }
}