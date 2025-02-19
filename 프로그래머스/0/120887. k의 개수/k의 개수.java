class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for (int l = i; l <= j; l++) {
            
            String str = String.valueOf(l);
            
            for (char c : str.toCharArray())          
                if(c == (k + 48)) answer++;
            
        }
        
        return answer;
    }
}