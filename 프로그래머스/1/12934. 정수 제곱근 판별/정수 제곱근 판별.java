class Solution {
    public long solution(long n) {
        long answer = 1;
 
		while((answer * answer) <= n){			
			if ((answer * answer) == n)	return (answer + 1) * (answer + 1);
			answer++;
		}

		return -1;
    }
}