import java.util.*;

class Solution {
    public int[][] solution(int n, int m, int[] a, int[] b, int k, int m1, int m2, int[] e1, int[] e2) {
        boolean[] in0 = new boolean[m + 1];
        boolean[] in1 = new boolean[m + 1];
        for (int x : e1) in0[x] = true;
        for (int x : e2) in1[x] = true;
        int[] type = new int[m + 1];
        Arrays.fill(type, -1);
        int cnt0 = 0, cnt1 = 0;
        for (int x : e1) if (!in1[x]) { type[x] = 0; cnt0++; }
        for (int x : e2) if (!in0[x]) { type[x] = 1; cnt1++; }
        int total = cnt0 + cnt1;
        int[][] ans = new int[total][2];
        int ptr = 0;

        int[] mo = new int[n + 1];
        int[] mt = new int[n + 1];
        for (int e = 1; e <= m; e++) if (type[e] == 0) { int u = a[e - 1], v = b[e - 1]; mo[u] = e; mo[v] = e; }
        for (int e = 1; e <= m; e++) if (type[e] == 1) { int u = a[e - 1], v = b[e - 1]; mt[u] = e; mt[v] = e; }

        boolean[] used = new boolean[m + 1];
        List<int[]> pos = new ArrayList<>();
        List<int[]> neg = new ArrayList<>();

        for (int v = 1; v <= n; v++) {
            int deg = (mo[v] != 0 ? 1 : 0) + (mt[v] != 0 ? 1 : 0);
            if (deg == 1) {
                int first = mo[v] != 0 ? mo[v] : mt[v];
                if (used[first]) continue;
                int[] seq = buildPathFromVertex(v, first, type, a, b, mo, mt, used);
                int L = seq.length;
                if (L == 0) continue;
                int tF = type[seq[0]], tL = type[seq[L - 1]];
                if (tF == 1 && tL == 1) {
                    pos.add(seq);
                } else if (tF == 0 && tL == 0) {
                    neg.add(seq);
                } else {
                    if (tF == 0 && tL == 1) {
                        ptr = emitEven01(seq, ptr, ans);
                    } else {
                        ptr = emitEven10(seq, ptr, ans);
                    }
                }
            }
        }

        for (int e = 1; e <= m; e++) {
            if (type[e] != -1 && !used[e]) {
                int[] cyc = buildCycleFromEdge(e, type, a, b, mo, mt, used);
                if (type[cyc[0]] != 0) {
                    int L = cyc.length;
                    int[] r = new int[L];
                    for (int i = 0; i < L; i++) r[i] = cyc[(i + 1) % L];
                    cyc = r;
                }
                ptr = emitCycle(cyc, ptr, ans);
            }
        }

        int cur = m1;
        int pi = 0, ni = 0;
        while (ni < neg.size()) {
            if (cur == k - 1 && pi < pos.size()) {
                ptr = emitPos(pos.get(pi++), ptr, ans);
                cur++;
            }
            ptr = emitNeg(neg.get(ni++), ptr, ans);
            cur--;
        }
        while (pi < pos.size()) {
            ptr = emitPos(pos.get(pi++), ptr, ans);
            cur++;
        }

        return ans;
    }

    private int[] buildPathFromVertex(int startV, int startE, int[] type, int[] a, int[] b, int[] mo, int[] mt, boolean[] used) {
        ArrayList<Integer> list = new ArrayList<>();
        int e = startE;
        int t = type[e];
        int prev = startV;
        while (e != 0 && !used[e]) {
            list.add(e);
            used[e] = true;
            int u = a[e - 1], v = b[e - 1];
            int nxtV = (u == prev) ? v : u;
            int nxtE = (t == 0) ? mt[nxtV] : mo[nxtV];
            prev = nxtV;
            e = nxtE;
            t ^= 1;
        }
        int[] ret = new int[list.size()];
        for (int i = 0; i < list.size(); i++) ret[i] = list.get(i);
        return ret;
    }

    private int[] buildCycleFromEdge(int startE, int[] type, int[] a, int[] b, int[] mo, int[] mt, boolean[] used) {
        ArrayList<Integer> list = new ArrayList<>();
        int e = startE;
        int t = type[e];
        int prev = a[e - 1];
        while (true) {
            list.add(e);
            used[e] = true;
            int u = a[e - 1], v = b[e - 1];
            int nxtV = (u == prev) ? v : u;
            int nxtE = (t == 0) ? mt[nxtV] : mo[nxtV];
            prev = nxtV;
            e = nxtE;
            t ^= 1;
            if (e == startE) break;
        }
        int[] ret = new int[list.size()];
        for (int i = 0; i < list.size(); i++) ret[i] = list.get(i);
        return ret;
    }

    private int emitPos(int[] seq, int ptr, int[][] ans) {
        int L = seq.length;
        for (int j = 1; j < L; j += 2) {
            ans[ptr][0] = 0; ans[ptr++][1] = seq[j];
            ans[ptr][0] = 1; ans[ptr++][1] = seq[j - 1];
        }
        ans[ptr][0] = 1; ans[ptr++][1] = seq[L - 1];
        return ptr;
    }

    private int emitEven01(int[] seq, int ptr, int[][] ans) {
        int L = seq.length;
        ans[ptr][0] = 0; ans[ptr++][1] = seq[0];
        for (int j = 2; j <= L - 2; j += 2) {
            ans[ptr][0] = 0; ans[ptr++][1] = seq[j];
            ans[ptr][0] = 1; ans[ptr++][1] = seq[j - 1];
        }
        ans[ptr][0] = 1; ans[ptr++][1] = seq[L - 1];
        return ptr;
    }

    private int emitEven10(int[] seq, int ptr, int[][] ans) {
        int L = seq.length;
        for (int j = 1; j < L; j += 2) {
            ans[ptr][0] = 0; ans[ptr++][1] = seq[j];
            ans[ptr][0] = 1; ans[ptr++][1] = seq[j - 1];
        }
        return ptr;
    }

    private int emitNeg(int[] seq, int ptr, int[][] ans) {
        int L = seq.length;
        ans[ptr][0] = 0; ans[ptr++][1] = seq[0];
        for (int j = 2; j < L; j += 2) {
            ans[ptr][0] = 0; ans[ptr++][1] = seq[j];
            ans[ptr][0] = 1; ans[ptr++][1] = seq[j - 1];
        }
        return ptr;
    }

    private int emitCycle(int[] seq, int ptr, int[][] ans) {
        int L = seq.length;
        ans[ptr][0] = 0; ans[ptr++][1] = seq[0];
        for (int j = 2; j < L; j += 2) {
            ans[ptr][0] = 0; ans[ptr++][1] = seq[j];
            ans[ptr][0] = 1; ans[ptr++][1] = seq[j - 1];
        }
        ans[ptr][0] = 1; ans[ptr++][1] = seq[L - 1];
        return ptr;
    }
}
