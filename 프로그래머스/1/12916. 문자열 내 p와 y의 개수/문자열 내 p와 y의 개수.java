class Solution {
    boolean solution(String s) {
        int zerosum = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p' || s.charAt(i) == 'P')
                zerosum++;
            else if (s.charAt(i) == 'y' || s.charAt(i) == 'Y')
                zerosum--;
        }

        return zerosum == 0 ? true : false ;
    }
}