import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long cats = Long.parseLong(br.readLine());
        int magicCount = 0;
        
        while (cats > 3) {
            cats = cats/2 + (cats % 2 == 1 ? 1 : 0);
            magicCount++;
        }
        
        System.out.println(magicCount + cats);
    }
}
