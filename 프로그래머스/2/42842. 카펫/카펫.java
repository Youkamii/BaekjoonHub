class Solution {
    public int[] solution(int brown, int yellow) {
		int x = (brown / 2) - 3;

		for (int y = 1; y < x + 1; y++) {
			if ((x * y) == yellow) return new int[]{x + 2,y + 2};
			x--;
		}
		return null;
    }
}