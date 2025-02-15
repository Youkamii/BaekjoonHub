class Solution {
    public StringBuilder solution(int[] n) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i < n.length; i++) {
            switch (n[i] - n[i - 1]) {
                case 1:
                    sb.append("w");
                    break;
                case -1:
                    sb.append("s");
                    break;
                case 10:
                    sb.append("d");
                    break;
                case -10:
                    sb.append("a");
                    break;
            }
        }
        
        return sb;
    }
}