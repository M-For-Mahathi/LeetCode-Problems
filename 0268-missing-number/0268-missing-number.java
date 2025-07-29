class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int sumN = (nums.length*(nums.length+1))/2;

        for (int i : nums){
            sum = sum+i;
        }

        int res = sumN - sum;
        return res;
        
    }
}