class Solution {
    public String[] solution(String[] sa) {
        
        for (int i = 0; i < sa.length; i++) {
            if (i % 2 == 0) 
                sa[i] = sa[i].toLowerCase();
            else
                sa[i] = sa[i].toUpperCase();
        }
        
        return sa;
    }
}