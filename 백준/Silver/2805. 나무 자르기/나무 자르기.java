import java.io.*;
import java.util.*;

public class Main {
    static class FastScanner {
        private final InputStream in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;
        FastScanner(InputStream is) { in = is; }
        private int read() throws IOException {
            if (ptr >= len) { len = in.read(buffer); ptr = 0; if (len < 0) return -1; }
            return buffer[ptr++];
        }
        long nextLong() throws IOException {
            int c; long sign = 1, x = 0;
            do { c = read(); } while (c <= ' ');
            if (c == '-') { sign = -1; c = read(); }
            while (c > ' ') { x = x * 10 + (c - '0'); c = read(); }
            return x * sign;
        }
        int nextInt() throws IOException { return (int) nextLong(); }
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);

        int n = fs.nextInt();
        long m = fs.nextLong();

        int[] trees = new int[n];
        int maxH = 0;
        for (int i = 0; i < n; i++) {
            int h = fs.nextInt();
            trees[i] = h;
            if (h > maxH) maxH = h;
        }

        long lo = 0, hi = maxH, ans = 0;
        while (lo <= hi) {
            long mid = (lo + hi) / 2;
            long got = 0;
            for (int h : trees) if (h > mid) got += (h - mid);
            if (got >= m) {  // 충분히 얻음 → 더 높게 잘라도 됨
                ans = mid;
                lo = mid + 1;
            } else {         // 모자람 → 더 낮춰야 함
                hi = mid - 1;
            }
        }
        System.out.println(ans);
    }
}
