class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder(my_string);
        
        for (int[] q : queries) {
            String reversed = new StringBuilder(sb.substring(q[0], q[1] + 1)).reverse().toString();
            sb.replace(q[0], q[1] + 1, reversed);
        }
        //sb는 신이다
        
        return sb.toString();
    }
}
