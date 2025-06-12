package com.suresh1.TwoDArray;

public class FindILand {
    public static void main(String[] args) {

    }
    // Function to find the number of islands in a 2D grid
    public static int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        int count = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') { // Found an island
                    count++;
                    dfs(grid, i, j); // Mark the entire island as visited
                }
            }
        }

        return count;
    }

    private static void dfs(char[][] grid, int i, int j) {
        // Check for out of bounds or water
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0') {
            return;
        }

        // Mark the cell as visited
        grid[i][j] = '0';

        // Explore all 4 directions (up, down, left, right)
        dfs(grid, i - 1, j); // Up
        dfs(grid, i + 1, j); // Down
        dfs(grid, i, j - 1); // Left
        dfs(grid, i, j + 1); // Right
    }

}
