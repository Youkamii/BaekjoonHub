class Solution {
    public int[] solution(int brown, int yellow) {
		int x = (brown / 2) - 3;
        int y;

		for (y = 1; y < x + 1; y++) {
			if ((x * y) == yellow)
                break;
            x--;
		}
		return new int[]{x + 2,y + 2};
    }
}