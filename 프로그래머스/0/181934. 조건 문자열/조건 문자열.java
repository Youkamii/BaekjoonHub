class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        return ineq.equals(">") ? (eq.equals("=") ? ((n >= m) ? 1 : 0) : (n > m ? 1 : 0))
            : (eq.equals("=") ? ((n <= m) ? 1 : 0) : (n < m ? 1 : 0));
    }
}