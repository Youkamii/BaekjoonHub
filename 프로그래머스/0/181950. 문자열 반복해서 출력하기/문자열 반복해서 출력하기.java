import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        String str = st.nextToken();
        int n = Integer.parseInt(st.nextToken());

        bw.write(str.repeat(n));
        bw.flush();
    }
}