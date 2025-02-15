class Solution {
    public StringBuilder solution(String s, int[] l) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < l.length; i++)
            sb.append(s.charAt(l[i]));        
        
        return sb;
    }
}