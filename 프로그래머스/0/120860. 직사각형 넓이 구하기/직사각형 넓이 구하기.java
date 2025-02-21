class Solution {
    public int solution(int[][] dots) {
        return (Math.max(dots[0][0], Math.max(dots[1][0], Math.max(dots[2][0], dots[3][0]))) - Math.min(dots[0][0], Math.min(dots[1][0], Math.min(dots[2][0], dots[3][0])))) * (Math.max(dots[0][1], Math.max(dots[1][1], Math.max(dots[2][1], dots[3][1]))) - Math.min(dots[0][1], Math.min(dots[1][1], Math.min(dots[2][1], dots[3][1]))));
    }
}
