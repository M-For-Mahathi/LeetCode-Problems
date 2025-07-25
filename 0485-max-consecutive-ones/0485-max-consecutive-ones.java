class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c = 0;
        int mx = 0;
        for(int n : nums){
            if (n!=0)
                c++;
            else{
                mx = Math.max(mx,c);
                c = 0;
            }
        }
        mx = Math.max(mx,c);
        return mx;
    }
}