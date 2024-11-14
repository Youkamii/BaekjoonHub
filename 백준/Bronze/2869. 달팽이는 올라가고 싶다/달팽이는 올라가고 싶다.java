import java.util.*;
import java.io.*;

class Main {
    static int stoi (String s) {
        return Integer.parseInt(s);
    }

    public static void main (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int move = stoi(st.nextToken());
        int fall = stoi(st.nextToken());
        int height = stoi(st.nextToken()) - move;

        int worked = move - fall;
        int days = height / worked + 1;

        System.out.println(days + (height % worked != 0 ? 1 : 0));
    }
}