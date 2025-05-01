class Solution {
    boolean solution(String s) {
        int counter = 0;

        for (int i = 0; i < s.length(); i++ ) {
            char c = s.charAt(i);
            if (c == 'p' || c == 'P')
                counter++;
            else if (c == 'y' || c == 'Y')
                counter--;            
        }

        return counter == 0 ? true : false;
    }
}