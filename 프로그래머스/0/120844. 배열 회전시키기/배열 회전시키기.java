class Solution {
    public int[] solution(int[] n, String d) {
        int[] answer = n;
        int l = n.length;
        
        if (d.equals("right")) {
            int last = n[l - 1];
            for (int i = l - 1; i > 0; i--)
                answer[i] = answer[i - 1];
            answer[0] = last;
        } else {
            int first = n[0];
            for (int i = 0; i < l - 1; i++)
                answer[i] = answer[i + 1];
            answer[l - 1] = first;
        }
        
        return answer;
    }
}