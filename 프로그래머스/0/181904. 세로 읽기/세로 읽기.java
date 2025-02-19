class Solution {
    public StringBuilder solution(String ms, int m, int c) {
        StringBuilder answer = new StringBuilder();
        
        for (int i = c - 1; i < ms.length(); i += m) 
            answer.append(ms.charAt(i));        
        
        return answer;
    }
}