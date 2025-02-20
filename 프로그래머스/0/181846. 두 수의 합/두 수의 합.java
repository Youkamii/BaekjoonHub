import java.util.*;
import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        return new BigInteger(a).add(new BigInteger(b)).toString();
    }
}
