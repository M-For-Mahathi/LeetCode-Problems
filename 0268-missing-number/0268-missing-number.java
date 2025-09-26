class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length, res = 0;
        for (int i = 0; i<n; i++){
            res ^= (i^nums[i]);
        }
        res ^= n;
        return res;
    }
}