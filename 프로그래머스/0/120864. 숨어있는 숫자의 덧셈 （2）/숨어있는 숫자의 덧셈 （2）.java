class Solution {
    public int solution(String ms) {
        int answer = 0;
        
        for (int i = 0; i < ms.length(); i++) {
            int a = (int) ((ms.charAt(i)) - 48);
            
            StringBuilder sb = new StringBuilder();
            
            if (a >= 0 && a <= 9) {
                for (int j = i; j < ms.length(); j++) {
                    int b = (int) ((ms.charAt(i)) - 48);
                    if (!(b >= 0 && b <= 9)) 
                        break;
                    sb.append(b);
                    i++;
                }
                answer += Integer.parseInt(sb.toString());
            }
            
        } 
        
        return answer;
    }
}