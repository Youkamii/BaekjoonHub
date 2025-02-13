using System;
using System.Collections.Generic;

public class Solution {
    public string[] solution(string[] names) {
        List<string> answer = new List<string>();
        
        answer.Add(names[0]);
        for (int i = 1; i < names.Length; i++) {
            
            if (i % 5 == 0) {
                answer.Add(names[i]);
            }      
        }
        
        return answer.ToArray();
    }
}