class Solution {
    public int solution(int n, String c) {
        
        for (int i = 0; i < c.length(); i++) {
            switch (c.charAt(i)) {
                case 'w':
                    n++;
                    break;
                case 's':
                    n--;
                    break;
                case 'a':
                    n -= 10;
                    break;
                case 'd':
                    n += 10;
                    break;
            }
        }
        
        return n;
    }
}