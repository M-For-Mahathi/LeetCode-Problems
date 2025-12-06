class Solution {
    public int maxSum(int[][] grid) {
        int nr = grid.length;
        int nc = grid[0].length;
        int mx = Integer.MIN_VALUE;

        for (int i = 0; i <= nr - 3; i++) {
            for (int j = 0; j <= nc - 3; j++) {
                int sum =
                        grid[i][j] + grid[i][j + 1] + grid[i][j + 2]
                                + grid[i + 1][j + 1]
                                + grid[i + 2][j] + grid[i + 2][j + 1] + grid[i + 2][j + 2];

                mx = Math.max(mx, sum);
            }
        }
        return mx;
    }
}