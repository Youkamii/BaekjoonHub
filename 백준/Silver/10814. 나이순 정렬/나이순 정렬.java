import java.util.*;
import java.io.*;

class Main {
    static int stoi (String s) {
        return Integer.parseInt(s);
    }
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = stoi(st.nextToken());
        
        List<String>[] list = new ArrayList[201];
        for (int i = 0; i < 201; i++) {
            list[i] = new ArrayList<>();
        }
        
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int age = stoi(st.nextToken());
            String name = st.nextToken();
            
            list[age].add(name);
        }
        
        for (int i = 0; i < 201; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                StringBuilder sb = new StringBuilder();
                sb.append(i).append(" ").append(list[i].get(j));
                System.out.println(sb);
            }
        }
    }
    
}