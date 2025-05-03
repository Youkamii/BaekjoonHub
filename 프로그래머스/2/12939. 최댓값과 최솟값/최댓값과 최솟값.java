class Solution {
    public String solution(String str) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        String[] strArray = str.split(" ");
        
        for (String s : strArray) {
            int i = Integer.parseInt(s);            
            if (i > max) max = i;
            if (i < min) min = i;
        }
        
        return min + " " + max;
    }
}