class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == 'a' || c == 'A') sb.append('A');
            else sb.append(Character.toLowerCase(c));
        }

        return sb.toString();
    }
}
