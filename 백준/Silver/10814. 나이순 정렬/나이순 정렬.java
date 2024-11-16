import java.util.*;
import java.io.*;

class Main {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        
        List<String>[] list = new ArrayList[201];
        for (int i = 0; i < 201; i++) {
            list[i] = new ArrayList<>();
        }
        
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            
            list[age].add(name);
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < 201; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                sb.append(i).append(" ").append(list[i].get(j)).append("\n");                
            }
        }
        bw.write(sb.toString());
		bw.flush();
        bw.close();
    }
    
}