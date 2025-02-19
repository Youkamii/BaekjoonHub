import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] sl = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) sl[i] = strArr[i].length();
        
        Arrays.sort(sl);
        
        int b = 0;
        int Max = 0;
        int cur = 0;
        for (int i : sl) {
            if (i != b) {
                b = i;
                if (Max < cur) Max = cur;
                cur = 1;
            } else cur++;
        }
        
        return Max < cur ? cur : Max;
    }
}