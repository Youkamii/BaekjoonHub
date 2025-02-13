class Solution {
    public int[] solution(int[] array) {
        int M = -1;
        int L = -1;
        
        for (int i = 0; i < array.length; i++) {            
            if (array[i] > M) {
                M = array[i];
                L = i;
            }
        }
        
        return new int[]{M,L};
    }
}