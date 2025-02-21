import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();        
        
        while(l % 5 != 0) l++;
        
        for (int i = l; i <= r; i += 5) {
            String str = String.valueOf(i).replaceAll("[0, 5]", "");                  
            
            if (str.equals("")) {
                list.add(i);
                System.out.println(i);
            }
        }            
        
        return list.size() == 0 ? new int[]{-1} : list.stream().mapToInt(Integer::valueOf).toArray();
    }
}