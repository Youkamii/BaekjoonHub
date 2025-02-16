class Solution {
    public int solution(int[] d1, int[] d2) {
        if (d1[0] != d2[0]) return d1[0] < d2[0] ? 1 : 0;
        if (d1[1] != d2[1]) return d1[1] < d2[1] ? 1 : 0;
        return d1[2] < d2[2] ? 1 : 0;
    }
}