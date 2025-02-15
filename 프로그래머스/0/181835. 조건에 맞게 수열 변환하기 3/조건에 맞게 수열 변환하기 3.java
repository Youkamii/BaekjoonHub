class Solution {
    public int[] solution(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++){
            if (k % 2 == 1)
                arr[i] *= k;
            else
                arr[i] += k;
        }
        return arr;
    }
}