class Solution {
    public int solution(int a, int b) {
        int r = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        return r >= a * b * 2 ? r : a * b * 2;
    }
}