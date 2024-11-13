import java.util.*;
import java.io.*;

class Main {
    static int stoi (String s) {
        return Integer.parseInt(s);
    }
    
    static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int count = stoi(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        int pm = 0;
        
        for (int i = 0; i < count; i++) {
            int n = stoi(st.nextToken());
            
            if (n == 1)
                continue;
            
            if(isPrime(n))
                pm++;           
        }
        
        System.out.println(pm);
        
    }
}