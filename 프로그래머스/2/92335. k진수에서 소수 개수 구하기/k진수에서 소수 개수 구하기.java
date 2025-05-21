import java.util.*;

class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        String numeral = Numeral(n, k);        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numeral.length(); i++) {
            char c = numeral.charAt(i);
            if (c == '0') {
                if (sb.length() > 0 && isPrime(sb.toString())) answer++;
                sb = new StringBuilder();
            } else sb.append(c);            
        }
        if (sb.length() > 0 && isPrime(sb.toString())) answer++;      

        return answer;
    }
    
    String Numeral(int n, int k) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % k);
            n /= k;
        }        
        return sb.reverse().toString();
    }
    
    boolean isPrime(String str) {
        
        long p = Long.parseLong(str);
        
        if (p <= 1) return false;
        if (p == 2) return true;
        if (p % 2 == 0) return false;
        int limit = (int) Math.sqrt(p);
        for (int i = 3; i <= limit; i += 2) 
            if (p % i == 0) return false;

        return true;
    }
}