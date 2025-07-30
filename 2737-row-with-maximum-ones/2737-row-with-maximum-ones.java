class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int mx = 0, k = 0;
        for (int i = 0; i < mat.length; i++){
            int c = 0;
            for (int j = 0; j <mat[i].length; j++){
                c+=mat[i][j];
            }

            if (c>mx){
                mx = c;
                k = i;
            }
        }

        return new int[]{k, mx};
    }
}