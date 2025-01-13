import java.util.*;
import java.io.*;

class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int tc = Integer.parseInt(br.readLine());
        for (int t = 0; t < tc; t++) {
            int memo = Integer.parseInt(br.readLine());
            HashSet<Integer> set = new HashSet<>(memo);
            
            StringTokenizer st = new StringTokenizer(br.readLine());            
            for (int i = 0; i < memo; i++)
                set.add(Integer.parseInt(st.nextToken()));      
            
            int qst = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < qst; i++) {
                int q = Integer.parseInt(st.nextToken());
                bw.write(set.contains(q) ? "1\n" : "0\n");
            }
        }      
		bw.flush();
    }
    
}