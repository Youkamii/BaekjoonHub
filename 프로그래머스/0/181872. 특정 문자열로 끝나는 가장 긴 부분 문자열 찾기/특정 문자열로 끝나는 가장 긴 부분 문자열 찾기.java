class Solution {
    public String solution(String ms, String p) {
        String answer = "";
        int msl = ms.length();
        int pl = p.length();
        
        for (int i = msl; i >= pl; i--) {
            
            String str = ms.substring(i - pl, i);
            
            if (str.equals(p)) {
                answer = ms.substring(0, i);
                break;
            }            
        }
        
        return answer;
    }
}

