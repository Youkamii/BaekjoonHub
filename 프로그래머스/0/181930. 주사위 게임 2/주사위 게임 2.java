import java.util.*;

class Solution {
    public int solution(int a, int b, int c) {
        
        int i = a + b + c;
        int j = a * a + b * b + c * c;
        int k = (int) ((Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3)));
        
        
        if (a == b && b == c)
            return i * j * k;
        else if (a == b || b == c || c == a)
            return i * j;
        else 
            return i;
    }
}