import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int cc = scanner.nextInt();
        String s = scanner.next();
        
        long sum = 0;
        
        for (int i = 0; i < cc; i++) {
            int n = s.charAt(i) - 'a' + 1;
            
            long power = (long) Math.pow(31, i);
            
            sum = (sum + (n * power) % 1234567891) % 1234567891;
            
        }
        
        System.out.println(sum);
        
        
    }
}