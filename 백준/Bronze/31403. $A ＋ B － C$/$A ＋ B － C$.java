import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        System.out.println(A + B - C);

        String strA = Integer.toString(A);
        String strB = Integer.toString(B);
        String strC = Integer.toString(C);
        System.out.println(Integer.parseInt(strA + strB) - Integer.parseInt(strC));
    }
}
