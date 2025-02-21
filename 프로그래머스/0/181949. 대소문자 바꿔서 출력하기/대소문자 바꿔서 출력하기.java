import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str = br.readLine();
        
        for (char c : str.toCharArray())
            bw.write(c + (Character.isLowerCase(c) ? -32 : 32));
        
        bw.flush();
    }
}