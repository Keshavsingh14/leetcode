class Solution {
    public int numIslands(char[][] grid) {
        if(grid == null) return 0;
        int n = grid.length;
        if(n == 0) return 0;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        int res = 0;
        for(int i =0; i<n; i++){
            for(int j =0; j<m; j++){
                if(grid[i][j] == '1' && !visited[i][j]){
                    numIslands(grid, visited, i, j, n, m);
                    res++;
                }
            }
        }
        return res;
    }
    void numIslands(char[][] grid, boolean[][] visited, int i, int j, int n, int m){
        if(i < 0 || i >= n || j < 0 || j >= m || grid[i][j] == '0' || visited[i][j]) return;
        visited[i][j] = true;
        numIslands(grid, visited, i-1, j, n, m);
        numIslands(grid, visited, i, j+1, n, m);
        numIslands(grid, visited, i+1, j, n, m);
        numIslands(grid, visited, i, j-1, n, m);
    }
}