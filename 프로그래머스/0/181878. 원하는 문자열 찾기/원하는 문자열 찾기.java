class Solution {
    public int solution(String myString, String pat) {
        return myString.toUpperCase().contains(pat.toUpperCase()) ? 1 : 0;
    }
}