class Solution {
    public int solution(int[] common) {
        return common[common.length - 1] - common[common.length - 2] == common[common.length - 2] - common[common.length - 3] ? common[common.length - 1] + common[common.length - 1] - common[common.length - 2] : common[common.length - 1] * (common[common.length - 1] / common[common.length - 2]);
    }
}