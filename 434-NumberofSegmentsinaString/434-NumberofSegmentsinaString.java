// Last updated: 9/7/2026, 8:37:51 PM
1class Solution {
2    public int islandPerimeter(int[][] grid) {
3        int perimeter = 0;
4        int rows = grid.length;
5        int cols = grid[0].length;
6        
7        for (int r = 0; r < rows; r++) {
8            for (int c = 0; c < cols; c++) {
9                if (grid[r][c] == 1) {
10                    perimeter += 4;
11                    if (r > 0 && grid[r-1][c] == 1) {
12                        perimeter -= 2;
13                    }
14                    if (c > 0 && grid[r][c-1] == 1) {
15                        perimeter -= 2;
16                    }
17                }
18            }
19        }
20        
21        return perimeter;
22    }
23}