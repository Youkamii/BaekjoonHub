import java.util.*;

public class Main {
    
    static int Euc(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        int gcd = Euc(a, b);
        int lcm = (a * b) / gcd;

        System.out.println(gcd);
        System.out.println(lcm);
    }
}