class Solution {
    public int solution(String str) {
        String[] answer = str.split(" ");
        
        int a = Integer.parseInt(answer[0]);
        int b = Integer.parseInt(answer[2]);
        
        switch (answer[1]) {
            case "+" :
                return a + b;
            case "-" :
                return a - b;
            case "*" :
                return a * b;        
        }
        return -1;
    }
}