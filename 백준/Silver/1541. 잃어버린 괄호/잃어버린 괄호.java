import java.io.*;
import java.util.*;

class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str = br.readLine();
        
        String[] numbers = str.split("[+-]");
        String signString = str.replaceAll("[0-9]+", " ").trim();
        int answer = Integer.parseInt(numbers[0]);
        String[] signs = signString.isEmpty() ? new String[0] : signString.split("\\s+");
        boolean sign = false;
        
        for (int i = 0; i < signs.length; i++) {
            int num = Integer.parseInt(numbers[i + 1]);
            
            if (signs[i].equals("-")) sign = true;            
            if (sign) answer -= num;
            else answer += num;            
        }
                
        bw.write(String.valueOf(answer));
        bw.flush();
    }
}