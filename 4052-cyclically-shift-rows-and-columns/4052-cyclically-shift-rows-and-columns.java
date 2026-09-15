class Solution {
    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
        for(int i = 0; i < rowShift.length; i++) shiftRow(grid, i, rowShift[i] % n);
        for(int j = 0; j < colShift.length; j++) shiftCol(grid, j, colShift[j] % n);   
        return grid;     
    }
    void shiftRow(int grid[][], int rowNum, int k) {
        int n = grid[rowNum].length;
        reverseRow(grid, rowNum, 0, n-1);
        reverseRow(grid, rowNum, 0, n-k-1);
        reverseRow(grid, rowNum, n-k, n-1);
    }
    void reverseRow(int[][] grid, int rowNum, int st, int en) {
        while(st < en) {
            int temp = grid[rowNum][st];
            grid[rowNum][st] = grid[rowNum][en];
            grid[rowNum][en] = temp;
            st++;
            en--; 
        }
    }
    void shiftCol(int[][] grid, int colNum, int k) {
        reverseCol(grid, colNum, 0, grid.length-1);
        reverseCol(grid, colNum, 0, grid.length-k-1);
        reverseCol(grid, colNum, grid.length-k, grid.length-1);
    }
    void reverseCol(int[][] grid, int colNum, int st, int en) {
        while(st < en) {
            int temp = grid[st][colNum];
            grid[st][colNum] = grid[en][colNum];
            grid[en][colNum] = temp;
            st++;
            en--;
        }
    }
} 