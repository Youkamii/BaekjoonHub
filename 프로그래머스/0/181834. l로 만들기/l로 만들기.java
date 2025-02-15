class Solution {
    public StringBuilder solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        for (char c : s.toCharArray()){
            if (c >= 'a' && c < 'l')
                sb.append("l");
            else
                sb.append(c);
        }
        
        return sb;
    }
}