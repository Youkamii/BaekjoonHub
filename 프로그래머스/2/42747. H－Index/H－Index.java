import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int citationsLength = citations.length;
        Arrays.sort(citations); 
 
        for (int i = 1; i <= citationsLength; i++) {
            int hIndex = 0;
            for (int j : citations) if (j >= i) hIndex++;
            if (hIndex >= i) answer = i;            
        } 

        return answer;
    }
}