import java.io.*;
import java.util.*;

public class Main {
    static int stoi(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        while(true) {
            st = new StringTokenizer(br.readLine());
            int[] tri = new int[3];
            
            tri[0] = stoi(st.nextToken());
            tri[1] = stoi(st.nextToken());
            tri[2] = stoi(st.nextToken());
            
            if (tri[0] == 0 && tri[1] == 0 && tri[2] == 0)
                break;
            
            Arrays.sort(tri);
            
            System.out.println(Math.pow(tri[0], 2) + Math.pow(tri[1], 2) == Math.pow(tri[2], 2) ? "right" : "wrong");
        }
        
        return ;
    }
}