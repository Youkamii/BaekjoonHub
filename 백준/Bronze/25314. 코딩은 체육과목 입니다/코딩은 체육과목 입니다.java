import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = (Integer.parseInt(br.readLine()) / 4);
        
        for(int i = 0; i < n; i++)
            bw.write("long ");
        bw.write("int");
        
        bw.flush();
    }
}