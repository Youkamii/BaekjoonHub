import java.util.*;

class Solution {
    class sro {
        double sr;
        int number;
        
        sro (int a, int b, int number) {
            this.sr = (a + b) / 2.0;
            this.number = number;
        }
    } 
    
    public int[] solution(int[][] score) {
        List<sro> srl = new ArrayList<>();
        for (int i = 0; i < score.length; i++)
            srl.add(new sro(score[i][0],score[i][1],i));
        
        srl.sort((a, b) -> Double.compare(b.sr, a.sr));

        int[] rank = new int[srl.size()];
        int r = 1;
        for (int i = 0; i < srl.size(); i++) {
            if (i > 0 && srl.get(i).sr == srl.get(i - 1).sr)
                rank[srl.get(i).number] = rank[srl.get(i - 1).number];
            else
                rank[srl.get(i).number] = r;
            r++;
        }
            
        return rank;
    }
}