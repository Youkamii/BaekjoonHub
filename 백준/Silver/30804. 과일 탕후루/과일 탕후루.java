import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++)
            list.add(Integer.parseInt(st.nextToken()));
        
        int ans = 0;
        int left = 0;
        Map<Integer, Integer> counts = new HashMap<>();
        
        for (int j = 0; j < n; j++) {
            int nf = list.get(j);
            counts.put(nf, counts.getOrDefault(nf, 0) + 1);
            
            while (counts.size() > 2) {
                int f1 = list.get(left);
                counts.put(f1, counts.get(f1) - 1);
                
                if (counts.get(f1) == 0)
                    counts.remove(f1);                
                left++;
            }
            
            int M = j - left + 1;
            if (M > ans)
                ans = M;
        }
        
        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}