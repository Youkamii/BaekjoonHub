class Solution {
    public String solution(String ms, int s, int e) {
        String p1 = ms.substring(0, s);
        String p2 = ms.substring(e + 1, ms.length());
        String tmp = new StringBuilder(ms.substring(s, e + 1)).reverse().toString();       
        
        return p1 + tmp + p2;
    }
}