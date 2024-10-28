class Solution {
    public long solution(int n) {
        
        long a = 1;
		long b = 1;
		long tmp;
		    
		for (int i = 1; i < n; i++) {
			tmp = a;
			a = (a + b) % 1234567;
			b = tmp;
		} 
		
		return a;
        
    }
}