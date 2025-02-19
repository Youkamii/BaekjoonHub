import java.util.*;

class Solution {
    public List<Integer> solution(int n) {
        List<Integer> answer = new ArrayList<>();
        
        for (int i = 2; i <= n; i++) {
            if (n % i == 0)
                answer.add(i);
            while (n % i == 0)
                n /= i;
        }
        
        return answer;
    }
}