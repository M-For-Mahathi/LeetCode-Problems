class Solution {
    public int countPrimeSetBits(int left, int right) {
        int c = 0;
        
        for (int i = left; i<=right; i++){
            int n = Integer.bitCount(i);
            if (n == 2 || n == 3 || n == 5 || n == 7 || n == 11 || n == 13 || n == 17 || n == 19)
                c++;
        }
        return c;
    }
}