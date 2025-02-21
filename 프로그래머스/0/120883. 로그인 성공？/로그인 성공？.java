class Solution {
    public String solution(String[] id_pw, String[][] db) {
        for (String[] str : db) {
            if (str[0].equals(id_pw[0])) {
                if (str[1].equals(id_pw[1]))
                    return "login";
                return "wrong pw";
            }
        }
        return "fail";
    }
}