import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String s = br.readLine();
        for (int i = 0; i < s.length(); i++)
            bw.write(s.charAt(i) + "\n");
        bw.flush();
    }
}