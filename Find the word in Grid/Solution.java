class Solution {
    public int[][] searchWord(char[][] grid, String word) {
        int n = grid.length; // number of rows in the grid
        int m = grid[0].length; // number of columns in the grid
        int k = word.length(); // length of the word we're searching for
        
        List<int[]> ans = new ArrayList<>(); // List to store the positions
        
        int[] dr = {0, 1, 0, -1, 1, 1, -1, -1}; // Array of changes in x direction for different neighbors
        int[] dc = {1, 0, -1, 0, 1, -1, 1, -1}; // Array of changes in y direction for different neighbors
        
        // Iterate through all cells in the grid
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // Check if the word can start from this cell
                if (check(grid, dr, dc, n, m, i, j, word, k)) {
                    // If yes, add the starting position to the answer list
                    ans.add(new int[]{i, j});
                }
            }
        }
        
        // Convert the list of positions to a 2D array and return
        int[][] result = new int[ans.size()][2];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }
        return result;
    }
    
    public boolean check(char[][] grid, int[] dr, int[] dc, int n, int m, int x, int y, String word, int k) {
        if (grid[x][y] != word.charAt(0)) {
            return false;
        }
        for (int p = 0; p < 8; p++) {
            int f = 1;
            for (int i = 1; i < k; i++) {
                int nx = x + i * dr[p];
                int ny = y + i * dc[p];
                if (nx >= 0 && ny >= 0 && nx < n && ny < m && grid[nx][ny] == word.charAt(i)) {
                    continue;
                } else {
                    f = 0;
                    break;
                }
            }
            if (f == 1) {
                return true;
            }
        }
        return false;
    }
}
