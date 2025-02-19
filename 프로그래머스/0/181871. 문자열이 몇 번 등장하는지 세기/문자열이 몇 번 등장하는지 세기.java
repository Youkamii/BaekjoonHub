class Solution {
    public int solution(String ms, String p) {
        int answer = 0;
        
        for (int i = 0; i < ms.length() - p.length() + 1; i++) {
            
            String str = ms.substring(i, i + p.length());
            if (str.equals(p)) answer++;
            
        }
        
        return answer;
    }
}