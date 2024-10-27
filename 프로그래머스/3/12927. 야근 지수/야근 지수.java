import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int work : works)
            maxHeap.add(work);

        for (int i = 0; i < n; i++) {
            if (maxHeap.isEmpty() || maxHeap.peek() == 0)
                break;
            int maxWork = maxHeap.poll();
            maxHeap.add(maxWork - 1);
        }

        long answer = 0;
        while (!maxHeap.isEmpty()) {
            int work = maxHeap.poll();
            answer += (long) work * work;
        }
        
        return answer;
    }
}
