using System;

public class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[n];
        
        for (int i = 0; i < n; i++) {
            answer[i] = num_list[i];
        }
        
        return answer;
    }
}



// using System;
// using System.Collections.Generic;

// public class Solution {
//     public int[] solution(int[] num_list, int n) {
//         List<int> answer = new List<int>();
        
//         for (int i = 0; i < n; i++) {
//             answer.Add(num_list[i]);
//         }
        
//         return answer.ToArray();
//     }
// }
