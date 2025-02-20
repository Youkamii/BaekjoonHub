class Solution {
    public int solution(int[] sides) {
        int a = Math.min(sides[0], sides[1]);
        int b = Math.max(sides[0], sides[1]);
        return (a + b - 1) - (b - a);
    }
}
