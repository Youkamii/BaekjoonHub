import java.util.Scanner;

public class Main {
    public static int f(int n) {
        int res = 1;
        for(int i = 2; i <= n; i++)
            res *= i;
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int res = f(N) / (f(K) * f(N - K));

        System.out.println(res);
    }
}
