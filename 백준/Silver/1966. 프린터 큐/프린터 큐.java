import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            LinkedList<int[]> queue = new LinkedList<>();
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                int priority = Integer.parseInt(st.nextToken());
                queue.add(new int[]{j, priority});
                priorityQueue.add(priority);
            }

            int p = 0;

            while (!queue.isEmpty()) {
                int[] current = queue.poll();
                if (current[1] == priorityQueue.peek()) {
                    p++;
                    priorityQueue.poll();
                    if (current[0] == m) {
                        System.out.println(p);
                        break;
                    }
                } else
                    queue.add(current);
            }
        }
    }
}