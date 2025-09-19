class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0, time = 0;
        int m = grid.length, n = grid[0].length;
        
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (grid[i][j] == 1){
                    fresh++;
                }
                if (grid[i][j] == 2){
                    q.offer(new int[]{i,j});
                }
            }
        }
        
        int[][] dtns = {{-1,0}, {1,0}, {0,-1}, {0,1}};

        while(q.size() > 0 && fresh > 0){
            int size = q.size();
            time++;
            for (int i = 0; i< size; i++){
                int[] curr = q.poll();
                int x = curr[0], y = curr[1];
                for (int[] dtn : dtns){
                    int nx = x + dtn[0];
                    int ny = y + dtn[1];
                    if (nx >= 0 && ny >= 0 && nx < m && ny < n && grid[nx][ny] == 1){
                        grid[nx][ny] = 2;
                        fresh--;
                        q.offer(new int[]{nx, ny});
                    }
                }
            }
        }
        return fresh == 0 ? time : -1;
    }
}