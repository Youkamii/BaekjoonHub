class Solution {
    public int solution(int s, int n) {        
        int i = 1;        
        while(true) {
            if (i * s / n > 0) 
                return i;        
            i++;
        }   
    }
}