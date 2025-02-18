import java.util.Arrays;

class Solution {
    class Event implements Comparable<Event> {
        int x, y1, y2, type;
        Event(int x, int y1, int y2, int type) {
            this.x = x; this.y1 = y1; this.y2 = y2; this.type = type;
        }
        public int compareTo(Event o) {
            return this.x - o.x;
        }
    }
    class SegmentTree {
        int n;
        int[] cnt;
        long[] len;
        int[] ys;
        SegmentTree(int n, int[] ys) {
            this.n = n;
            this.ys = ys;
            cnt = new int[4 * n];
            len = new long[4 * n];
        }
        void update(int idx, int l, int r, int ql, int qr, int val) {
            if(ql > r || qr < l) return;
            if(ql <= l && r <= qr) {
                cnt[idx] += val;
            } else {
                int mid = (l + r) >> 1;
                update(idx << 1, l, mid, ql, qr, val);
                update(idx << 1 | 1, mid + 1, r, ql, qr, val);
            }
            if(cnt[idx] > 0) {
                len[idx] = ys[r + 1] - ys[l];
            } else {
                if(l == r) len[idx] = 0;
                else len[idx] = len[idx << 1] + len[idx << 1 | 1];
            }
        }
    }
    public long solution(int[][] rectangles) {
        int n = rectangles.length;
        Event[] events = new Event[2 * n];
        int[] yArr = new int[2 * n];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            int x1 = rectangles[i][0], y1 = rectangles[i][1], x2 = rectangles[i][2], y2 = rectangles[i][3];
            events[idx] = new Event(x1, y1, y2, 1); idx++;
            events[idx] = new Event(x2, y1, y2, -1); idx++;
            yArr[2 * i] = y1;
            yArr[2 * i + 1] = y2;
        }
        Arrays.sort(events);
        Arrays.sort(yArr);
        int m = 1;
        for (int i = 1; i < yArr.length; i++) {
            if (yArr[i] != yArr[m - 1]) yArr[m++] = yArr[i];
        }
        int[] ys = Arrays.copyOf(yArr, m);
        SegmentTree seg = new SegmentTree(m - 1, ys);
        long area = 0;
        int prevX = events[0].x;
        seg.update(1, 0, seg.n - 1, lowerBound(ys, events[0].y1), lowerBound(ys, events[0].y2) - 1, events[0].type);
        for (int i = 1; i < events.length; i++) {
            int curX = events[i].x;
            area += (long)(curX - prevX) * seg.len[1];
            prevX = curX;
            seg.update(1, 0, seg.n - 1, lowerBound(ys, events[i].y1), lowerBound(ys, events[i].y2) - 1, events[i].type);
        }
        return area;
    }
    int lowerBound(int[] arr, int key) {
        int lo = 0, hi = arr.length;
        while(lo < hi) {
            int mid = (lo + hi) >> 1;
            if(arr[mid] < key) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }
}
