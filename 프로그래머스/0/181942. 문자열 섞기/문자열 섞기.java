class Solution {
    public StringBuilder solution(String str1, String str2) {
        StringBuilder answer = new StringBuilder();
        
        for (int i = 0; i < str1.length(); i++)
            answer.append(str1.charAt(i)).append(str2.charAt(i));
        
        return answer;
    }
}