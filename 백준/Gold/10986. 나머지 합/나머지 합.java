import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());        
        long sum = 0;
        long count = 0;
        long[] array = new long[m];
        array[0] = 1;

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            sum = (sum + Long.parseLong(st.nextToken())) % m;
            count += array[(int)sum];
            array[(int)sum]++;
        }
        
        bw.write(count + "\n");
        bw.flush();
    }
}
