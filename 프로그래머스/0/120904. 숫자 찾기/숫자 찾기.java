class Solution {
    public int solution(int num, int k) {
        String str = String.valueOf(num);
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == (char)(k + 48))
                return i + 1;
        }
        
        return -1;
    }
}