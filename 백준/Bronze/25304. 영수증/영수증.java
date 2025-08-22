import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int price = Integer.parseInt(br.readLine());
        int sum = 0;
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            sum += (Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken()));
        }
        System.out.println(price == sum ? "Yes" : "No");                    
    }
}