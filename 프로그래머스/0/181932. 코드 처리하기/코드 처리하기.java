class Solution {
    public String solution(String code) {
        StringBuilder sb = new StringBuilder();
        char[] ca = code.toCharArray();
        int mode = 0;
        
        for (int i = 0; i < ca.length; i++) {
            if (ca[i] == '1')
                mode++;
            else if (mode % 2 == 0 && i % 2 == 0)
                sb.append(ca[i]);
            else if (mode % 2 == 1 && i % 2 == 1)
                sb.append(ca[i]);    
        }                

        String answer = sb.toString();
        
        return answer.equals("") ? "EMPTY" : answer;
    }
}