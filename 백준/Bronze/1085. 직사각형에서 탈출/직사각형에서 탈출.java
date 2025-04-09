import java.util.*;
import java.io.*;

class Main{
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] list = new int[4];
        for (int i = 0; i < 4; i++)
            list[i] = Integer.parseInt(st.nextToken());
        
        int min1 = Math.min(list[0], list[2] - list[0]);
        int min2 = Math.min(list[1], list[3] - list[1]);

        bw.write(String.valueOf(Math.min(min1, min2)));
        bw.flush();  
    }
    
}