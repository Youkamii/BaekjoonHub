import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int n = 0;
        int c;
        
        while ((c = System.in.read()) <= 32); 
        
        do {
            n = (n << 3) + (n << 1) + (c - '0');
        } while ((c = System.in.read()) > 32);

        int loop = n / 4;

        byte[] buffer = new byte[loop * 5 + 3];
        int idx = 0;

        for (int i = 0; i < loop; i++) {
            buffer[idx++] = 108;
            buffer[idx++] = 111;
            buffer[idx++] = 110;
            buffer[idx++] = 103;
            buffer[idx++] = 32;
        }

        buffer[idx++] = 105;
        buffer[idx++] = 110;
        buffer[idx++] = 116;

        System.out.write(buffer);
    }
}