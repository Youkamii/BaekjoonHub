class Solution {
    public int solution(int[] arr, int idx) {
        int l = arr.length;
        
        if (idx >= arr.length) 
            return -1;
        else {
            for (int i = idx; i < l; i++) {
                if (arr[i] == 1) return i;            
            }
        }
        return -1;
    }
}