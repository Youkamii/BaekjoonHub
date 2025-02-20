class Solution {
    public StringBuilder solution(String ms, String os, int s) {
        return new StringBuilder(ms).replace(s, s + os.length(), os);
    }
}
