class Solution {
    public String solution(String s) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        String[] sc = s.split(" ");
        
        for (String ss : sc) {
            int i = Integer.parseInt(ss);            
            if (i > max) max = i;
            if (i < min) min = i;
        }
        
        return min + " " + max;
    }
}