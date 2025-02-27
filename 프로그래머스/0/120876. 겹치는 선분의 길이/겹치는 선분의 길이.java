class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] tl = new int[201];
        for (int i = 0; i < 201; i++) tl[i] = 0;
        
        for (int[] line : lines) {
            int s = line[0] + 101;
            int e = line[1] + 100;
            for (int i = s; i <= e; i++)              
                tl[i]++;                
        }
        
        for (int i = 1; i <= 200; i++)
            if (tl[i] >= 2) answer++;        
        
        return answer;
    }
}