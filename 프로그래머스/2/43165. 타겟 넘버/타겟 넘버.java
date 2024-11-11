class Solution {
    
    int answer103;
	int numbersLength103;
	int[] numbers103;
    
	public int solution(int[] numbers, int target) {
		answer103 = 0;
		numbersLength103 = numbers.length;
		numbers103 = numbers;

		dfs103Controller (target, 0, 0); 

		return answer103;
	}

	public void dfs103Controller (int target, int nowDepth, int currentSum) {
		if (nowDepth == numbersLength103) {
            if (currentSum == target) {
                answer103++;
            }
        return;
    }

		dfs103Controller(target, nowDepth + 1, currentSum + numbers103[nowDepth]);
		dfs103Controller(target, nowDepth + 1, currentSum - numbers103[nowDepth]);
	}
}