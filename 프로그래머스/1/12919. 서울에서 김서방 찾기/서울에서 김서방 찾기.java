class Solution {
    public String solution(String[] seoul) {
        int answer = 0;
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim"))
                break;
            answer++;
        }
        return "김서방은 " + answer + "에 있다";
    }
}