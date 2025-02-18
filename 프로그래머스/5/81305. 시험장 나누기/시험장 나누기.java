class Solution {
    int[] left, right, num;
    int n;
    final long INF = (long) 1e15;
    int root;

    class Pair {
        long merged;
        int cuts;

        Pair(long m, int c) {
            merged = m;
            cuts = c;
        }
    }

    Pair better(Pair a, Pair b) {
        if (a == null) return b;
        if (b == null) return a;
        if (a.cuts != b.cuts) return a.cuts < b.cuts ? a : b;
        return a.merged <= b.merged ? a : b;
    }

    Pair dfs(int u, long X) {
        if (u == -1) return new Pair(0, 0);

        if (left[u] == -1 && right[u] == -1) {
            if (num[u] > X) return new Pair(INF, Integer.MAX_VALUE);
            return new Pair(num[u], 0);
        }

        if (left[u] != -1 && right[u] == -1) {
            Pair child = dfs(left[u], X);
            if (child.merged >= INF) return child;

            Pair cand1 = null;
            if (child.merged + num[u] <= X) cand1 = new Pair(child.merged + num[u], child.cuts);

            Pair cand2 = null;
            if (num[u] <= X) cand2 = new Pair(num[u], child.cuts + 1);

            return better(cand1, cand2);
        }

        if (left[u] == -1 && right[u] != -1) {
            Pair child = dfs(right[u], X);
            if (child.merged >= INF) return child;

            Pair cand1 = null;
            if (child.merged + num[u] <= X) cand1 = new Pair(child.merged + num[u], child.cuts);

            Pair cand2 = null;
            if (num[u] <= X) cand2 = new Pair(num[u], child.cuts + 1);

            return better(cand1, cand2);
        }

        Pair L = dfs(left[u], X);
        Pair R = dfs(right[u], X);
        if (L.merged >= INF || R.merged >= INF) return new Pair(INF, Integer.MAX_VALUE);

        Pair best = null;
        if (L.merged + R.merged + num[u] <= X) 
            best = better(best, new Pair(L.merged + R.merged + num[u], L.cuts + R.cuts));

        if (L.merged + num[u] <= X) 
            best = better(best, new Pair(L.merged + num[u], L.cuts + R.cuts + 1));

        if (R.merged + num[u] <= X) 
            best = better(best, new Pair(R.merged + num[u], L.cuts + R.cuts + 1));

        if (num[u] <= X) 
            best = better(best, new Pair(num[u], L.cuts + R.cuts + 2));

        if (best == null) return new Pair(INF, Integer.MAX_VALUE);
        return best;
    }

    public int solution(int k, int[] num, int[][] links) {
        n = num.length;
        this.num = num;
        left = new int[n];
        right = new int[n];
        boolean[] isChild = new boolean[n];

        for (int i = 0; i < n; i++) {
            left[i] = links[i][0];
            right[i] = links[i][1];
            if (left[i] != -1) isChild[left[i]] = true;
            if (right[i] != -1) isChild[right[i]] = true;
        }

        root = 0;
        for (int i = 0; i < n; i++) {
            if (!isChild[i]) {
                root = i;
                break;
            }
        }

        long lo = 0, hi = 0;
        for (int i = 0; i < n; i++) {
            lo = Math.max(lo, num[i]);
            hi += num[i];
        }

        int answer = 0;
        while (lo <= hi) {
            long mid = (lo + hi) >> 1;
            Pair res = dfs(root, mid);
            int groups = res.cuts + 1;

            if (groups <= k) {
                answer = (int) mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        return answer;
    }
}
