import java.util.*;
import java.io.*;

class Main {
    static int stoi(String s) {
        return Integer.parseInt(s);
    }
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = stoi(st.nextToken());
        
        for (int i = 1; i < n; i++) {
            int tmp = i;
            int fn = i;           
          
            while (tmp > 0) {
                fn += tmp % 10;
                tmp /= 10;
            }
            
            if (n == fn) {
                System.out.println(i);
                return ;
            }
            
            
        }
        
        System.out.println(0);
    }
    
}