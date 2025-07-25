class Solution {
    public int maxSubArray(int[] nums) {
        int cs = 0;
        int mx = Integer.MIN_VALUE;
        for(int n : nums){
            cs += n;
            mx = Math.max(mx,cs);
            if (cs < 0)
                cs = 0;
        }
        return mx;  
    }
}