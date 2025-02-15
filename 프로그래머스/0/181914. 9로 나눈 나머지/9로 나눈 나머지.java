class Solution {
    public int solution(String n) {
        int sum = 0;
        for (char c : n.toCharArray())
            sum += c - 48;
        
        return sum % 9;
    }
}