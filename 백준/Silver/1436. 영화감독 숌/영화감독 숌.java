import java.io.*;

class Main {
    
    static int stoi(String s) {
        return Integer.parseInt(s);
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int D = stoi(br.readLine().trim());
        int count = 0;
        int cur = 666;
        
        while (true) {
            if (String.valueOf(cur).contains("666"))
                count++;
            if (count == D) {
                System.out.println(cur);
                break;
            }
            cur++;
        }
    }
}