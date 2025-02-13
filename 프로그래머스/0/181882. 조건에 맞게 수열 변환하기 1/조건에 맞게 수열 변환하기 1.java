class Solution {
    public int[] solution(int[] a) {
        int l = a.length;
        int[] answer = new int[l];
        
        for (int i = 0; i < l; i++) {
            int ai = a[i];
            if (ai >= 50 && ai % 2 == 0)
                answer[i] = ai / 2;
            else if (ai < 50 && ai % 2 == 1)
                answer[i] = ai * 2;
            else
                answer[i] = ai;
        }
            
        return answer;
    }
}