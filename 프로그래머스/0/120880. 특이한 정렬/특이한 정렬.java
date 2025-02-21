import java.util.*;


class Solution {
    
    public class Nl {
    double d;
    int arrI;
    
    Nl (int i, int id) {
        this.arrI = i;
        this.d = Math.abs((double)id - 0.1);
    }
}
    
    public int[] solution(int[] numlist, int n) {
        List<Nl> list = new ArrayList<>();
        int l = numlist.length;
        for (int i = 0; i < l; i++)
            list.add(new Nl(numlist[i], numlist[i] - n));
        
        list.sort((a, b) -> a.d == b.d ? b.arrI - a.arrI : Double.compare(a.d, b.d));

        
        int[] answer = new int[l];
        for (int i = 0; i < l; i++)
            answer[i] = list.get(i).arrI;
        
        return answer;
    }
}