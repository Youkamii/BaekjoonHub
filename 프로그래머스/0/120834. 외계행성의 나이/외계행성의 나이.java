class Solution {
    public StringBuilder solution(int age) {
        StringBuilder sb = new StringBuilder();
        String str = String.valueOf(age);
        
        for (char c : str.toCharArray())
            sb.append((char)(c + 49));
        
        return sb;
    }
}