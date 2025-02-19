class Solution {
    public int[] solution(int[] arr, int[][] queries) {

        for (int[] qr : queries) {
            int tmp = arr[qr[1]];
            arr[qr[1]] = arr[qr[0]];
            arr[qr[0]] = tmp;
        }
        
        return arr;
    }
}