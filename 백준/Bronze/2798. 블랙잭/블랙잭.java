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
        int bj = stoi(st.nextToken());        
        int[] cards = new int[n];
        
        st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < n; i++) 
            cards[i] = stoi(st.nextToken());
        
        int blackJack = 0;
        
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int sum = cards[i] + cards[j] + cards[k];
                    
                    if (sum <= bj && sum >= blackJack)
                        blackJack = sum;
                }
            }
        }
        
        System.out.println(blackJack);
    }
}