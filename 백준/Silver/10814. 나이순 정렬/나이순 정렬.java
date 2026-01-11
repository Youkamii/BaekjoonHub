import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Reader r = new Reader();
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = r.nextInt();
        
        StringBuilder[] b = new StringBuilder[201];
        String[] ageStr = new String[201];
        
        for (int i = 1; i <= 200; i++) {
            b[i] = new StringBuilder();
            ageStr[i] = i + " ";
        }

        for (int i = 0; i < n; i++) {
            int age = r.nextInt();
            b[age].append(ageStr[age]);
            r.appendName(b[age]);
        }

        for (int i = 1; i <= 200; i++) {
            if (b[i] != null && b[i].length() > 0)
                w.write(b[i].toString());
            
        }
        w.flush();
        w.close();
    }

    static class Reader {
        final int SIZE = 1 << 16;
        byte[] buffer = new byte[SIZE];
        int index, size;

        int nextInt() throws Exception {
            int n = 0;
            byte c;
            
            while ((c = read()) <= 32);
            do {
                n = (n << 3) + (n << 1) + (c & 15);
            } while (isNumber(c = read()));
            
            return n;
        }

        void appendName(StringBuilder sb) throws Exception {
            byte c = read();
            while (c > 32) {
                sb.append((char)c);
                c = read();
            }
            
            sb.append('\n');
        }

        boolean isNumber(byte c) {
            return 47 < c && c < 58;
        }

        byte read() throws Exception {
            if (index == size) {
                size = System.in.read(buffer, index = 0, SIZE);
                if (size == -1)
                    return -1;
            }
            
            return buffer[index++];
        }
    }
}