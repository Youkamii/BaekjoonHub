import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt();
        
        if (t == 1) {
            System.out.println(1);
            return;
        }
        
        int step = 1;
        
        int l = 1;
        int n = 1;
        int m;
        
        while (true) {
            m = n + l * 6;
            
            if (t <= m) {
                System.out.println(step + 1);
                return;
            }
            
            n = m;
            l++;
            step++;
        }
    }
}