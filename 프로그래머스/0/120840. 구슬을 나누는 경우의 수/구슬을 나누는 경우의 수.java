import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        return combination(balls, share).intValue();
    }

    public BigInteger combination(int n, int r) {
        BigInteger result = BigInteger.ONE;
        
        for (int i = 0; i < r; i++) 
            result = result.multiply(BigInteger.valueOf(n - i))
                          .divide(BigInteger.valueOf(i + 1));
        
        return result;
    }
}
