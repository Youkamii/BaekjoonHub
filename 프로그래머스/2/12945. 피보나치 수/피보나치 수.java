class Solution {
    public int solution(int n) {
        return Fibonacci_2(n);
	}

	public int Fibonacci_1 (int n) {
		if (n <= 1)
			return n;
		else
			return Fibonacci_1(n - 1) + Fibonacci_1(n - 2);
	}

	public int Fibonacci_2 (int n) {
		if (n <= 1)
			return n;

		int tmp;
		int num1 = 1;
		int num2 = 1;

		for (int i = 2; i< n; i++) {
			tmp = num1;
			num1 = (num1 + num2) % 1234567;
			num2 = tmp;
		}
        
		return num1;
	}
}