import java.util.*;
import java.io.*;

public class Main {
    
    static int stoi (String s) {
        return Integer.parseInt(s);
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());        
        
        int p = stoi(st.nextToken());
        
        st = new StringTokenizer(br.readLine()); 
        
        int[] size = new int[6];
        for (int i = 0; i < 6; i++)
            size[i] = stoi(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        
        int T = stoi(st.nextToken());
        int P = stoi(st.nextToken());
        
        //
        
        int pt = 0;
        
        for(int i : size) {
            while (i > 0) {
                i -= T;
                pt++;
            }
        }
        
        System.out.println(pt);
        System.out.print(p / P + " ");
        System.out.print(p % P);
        
    }

    
    
}