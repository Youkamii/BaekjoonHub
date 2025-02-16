class Solution {
    public int[] solution(int[] arr, int[][] queries) {

        for (int[] qr : queries) {
            for (int i = qr[0]; i <= qr[1]; i++)
                arr[i]++;            
        }
        
        return arr;
    }
}