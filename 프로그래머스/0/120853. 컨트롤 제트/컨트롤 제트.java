import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int before = 0;
        StringTokenizer st = new StringTokenizer(s);
        
        while(st.hasMoreTokens()) {
            String str = st.nextToken();
            if (str.equals("Z"))
                answer -= before;
            else {
                int curInt = Integer.parseInt(str);
                answer += curInt;
                before = curInt;;
            }                
        }
        
        return answer;
    }
}

// class Solution {
//     public int solution(String s) {
//         int answer = 0;
//         int before = 0;
        
//         String[] strArr = s.split(" ");
//         for (String str : strArr) {
//             if (str.equals("Z"))
//                 answer -= before;
//             else {
//                 int i = Integer.parseInt(str);
//                 answer += i;
//                 before = i;
//             }
//         }
        
        
//         return answer;
//     }
// }