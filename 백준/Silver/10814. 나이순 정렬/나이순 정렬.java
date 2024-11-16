import java.util.*;
import java.io.*;

class Main {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        
        StringBuilder[] Blist = new StringBuilder[201];
        for (int i = 0; i < 201; i++) {
            Blist[i] = new StringBuilder();
        }
        
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            
            Blist[age].append(age).append(" ").append(st.nextToken()).append("\n");  
        }
        
        for (int i = 0; i < 201; i++) {
            bw.write(Blist[i].toString());
        }
        
		bw.flush();
    }
    
}