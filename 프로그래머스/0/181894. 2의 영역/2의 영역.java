class Solution {
    public int[] solution(int[] arr) {
        int s = 0, e = 0, l = arr.length;
        boolean t = false;
        
        for (int i = 0; i < l; i++) {
            if (arr[i] == 2) {
                s = i;
                t = true;
                break;
            }
        }
        for (int i = l - 1; i > 0; i--) {
            if (arr[i] == 2) {
                e = i;
                break;
            }
        }
        
        if (!t)
            return new int[]{-1};
        else if (s == e)
            return new int[]{2};
        else {
            int[] answer = new int[e - s + 1];
            for (int i = 0; i < answer.length; i++)
                answer[i] = arr[i + s];
            return answer;
        }
            
        

    }
}