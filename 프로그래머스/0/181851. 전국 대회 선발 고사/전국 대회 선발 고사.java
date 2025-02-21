import java.util.*;

class 학생 {
    int number;
    int rank;
    
    학생 (int number, int rank) {
        this.number = number;
        this.rank = rank;
    }
}

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        List<학생> list = new ArrayList<>();

        for (int i = 0; i < rank.length; i++)
            if (attendance[i]) list.add(new 학생(i, rank[i]));        

        list.sort(Comparator.comparingInt(p -> p.rank));

        return 10000 * list.get(0).number + 100 * list.get(1).number + list.get(2).number;
    }
}
