import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;

        for (int i = 5; i <= n; i *= 5)
            count += n / i;

        System.out.println(count);
    }
}