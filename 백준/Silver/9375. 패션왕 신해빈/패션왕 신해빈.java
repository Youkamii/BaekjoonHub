import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < T; i++) {
            
            int n = Integer.parseInt(br.readLine());
            Map<String, Integer> map = new HashMap<>();
            
            for(int j = 0; j < n; j++) {
                String[] arr = br.readLine().split(" ");
                map.put(arr[1], map.getOrDefault(arr[1], 0) + 1);
            }
            
            int ans = 1;
            
            for(int val : map.values()) ans *= val + 1;
            
            bw.write(String.valueOf(ans - 1));
            bw.newLine();
        }
        bw.flush();
    }
}
