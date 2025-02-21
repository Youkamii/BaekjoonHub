class Solution {
    
    public boolean check3(int n) {
        if (n % 3 == 0) return true;
        
        String str = String.valueOf(n);
        for(char c : str.toCharArray())
            if (c == '3') return true;
        
        return false;        
    }
    
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 0; i < n; i++) {        
            while(check3(answer)) answer++;
            answer++;
            System.out.println(answer);
        }
        System.out.println("...? 이거 왜 되지?????????????");
        return answer - 1;
    }
}