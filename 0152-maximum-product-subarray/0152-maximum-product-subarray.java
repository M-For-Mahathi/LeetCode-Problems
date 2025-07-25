class Solution {
    public int maxProduct(int[] nums) {
        int mxp = nums[0];
        int mnp = nums[0];
        int res = nums[0];
        
        for (int i = 1; i < nums.length; i++){
            if (nums[i] < 0){
                int temp = mxp;
                mxp = mnp;
                mnp = temp;
            }
            mxp = Math.max(nums[i],mxp*nums[i]);
            mnp = Math.min(nums[i],mnp*nums[i]);
            res = Math.max (res, mxp);             
        }
        return res;
    }
}