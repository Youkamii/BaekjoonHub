import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        myStr = myStr.replaceAll("[abc]", " ").trim();
        String[] str = myStr.split("\\s+");

        str = Arrays.stream(str).filter(s -> !s.isEmpty()).toArray(String[]::new);

        return str.length == 0 ? new String[]{"EMPTY"} : str;
    }
}
