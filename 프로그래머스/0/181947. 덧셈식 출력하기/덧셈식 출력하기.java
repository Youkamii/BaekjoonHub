import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] i = br.readLine().split(" ");
        
        bw.write(i[0]);
        bw.write(" + ");
        bw.write(i[1]);
        bw.write(" = ");
        bw.write((Integer.parseInt(i[0]) + Integer.parseInt(i[1])) + "\n");
        bw.flush();
    }
}