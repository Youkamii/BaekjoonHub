class Solution {
    public int solution(int n) {
        int n1 = binaryOneCounting(n);
        int current = n + 1;     
        
        while (true) {
            int currentOne = binaryOneCounting(current);
            
            if (currentOne == n1)
                return current;
            current++;            
        }        
    }
    
    public int binaryOneCounting(int num) {
        String strBnr = Integer.toBinaryString(num);
        int one = 0;
        
        for (int i = 0; i < strBnr.length(); i++) {
            if (strBnr.charAt(i) == '1')
                one++;
        }
        return one;
    }
}

