class Solution {
    public int diagonalPrime(int[][] nums) {
        int n = nums.length;
        int mx = 0;

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if ((i==j) || ((i+j) == (n-1))){
                    if (isPrime (nums[i][j]))
                        mx = Math.max(mx, nums[i][j]);
                }
            }
        }
        return mx;
    }

    public boolean isPrime(int n){
        if (n == 1) return false;

        for (int i = 2; i*i <= n; i++){
            if (n%i == 0)
                return false;
        }
        return true;
    }
}