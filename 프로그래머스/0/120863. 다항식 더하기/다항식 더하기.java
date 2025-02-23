import java.util.*;

class Solution {
    public String solution(String polynomial) {
        String[] terms = polynomial.split(" ");
        int n = 0;
        int xn = 0;

        for (String term : terms) {
            if (term.equals("+")) continue;
            if (term.endsWith("x")) 
                xn += term.length() == 1 ? 1 : Integer.valueOf(term.substring(0, term.length() - 1));
            else 
                n += Integer.valueOf(term);
        }

        if (xn == 0) return String.valueOf(n);
        if (n == 0) return xn == 1 ? "x" : xn + "x";
        return (xn == 1 ? "x" : xn + "x") + " + " + n;
    }
}