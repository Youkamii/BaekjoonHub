import java.util.*;

// class Solution {
//     public int[] solution(int[] numbers) {
//         List<Integer> list = new ArrayList<>();
        
//         boolean ad = false;
        
//         for (int i = 0; i < numbers.length - 1; i++) {
//             for (int j = i + 1; j < numbers.length; j++) {
//                 if (numbers[i] < numbers[j]) {
//                     list.add(numbers[j]);                    
//                     break;
//                 }
//                 if (j == numbers.length - 1)
//                     list.add(-1);  
//             }
//         }
//         list.add(-1); 
        
//         int[] answer = new int[list.size()];
//         for (int i = 0; i < list.size(); i++)
//             answer[i] = list.get(i);        
        
//         return answer;
//     }
// }

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = numbers.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= numbers[i])
                stack.pop();            

            answer[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(numbers[i]);
        }

        return answer;
    }
}
