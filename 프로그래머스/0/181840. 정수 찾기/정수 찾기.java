class Solution {
    public int solution(int[] l, int n) {
        for (int i = 0; i < l.length; i++) if (l[i] == n) return 1;
        return 0;
    }
}