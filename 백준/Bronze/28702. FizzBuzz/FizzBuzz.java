import java.io.*;
import java.util.*;

class Main {
    static int stoi (String s) {
        return Integer.parseInt(s);
    }

    static String NextFizzBuzz(String str, int next) {
        int cur = stoi(str) + next;

        if (cur % 3 == 0 && cur % 5 == 0)
            return ("FizzBuzz");
        else if (cur % 3 == 0 && !(cur % 5 == 0))
            return ("Fizz");
        else if (!(cur % 3 == 0) && cur % 5 == 0)
            return ("Buzz");
        else
            return String.valueOf(cur);
    }

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int next = 3;
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            if (!(str.startsWith("F") || str.startsWith("B"))) {
                System.out.println(NextFizzBuzz(str, next));
                return;
            }
            next--;
        }
    }
}