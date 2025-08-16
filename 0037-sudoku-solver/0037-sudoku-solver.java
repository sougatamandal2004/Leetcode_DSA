class Solution {
    public boolean isSafe(char[][] board, int row, int col, char digit) {
        // check row and column
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == digit || board[i][col] == digit) {
                return false;
            }
        }
        // grid 
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        //3*3 grid
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(board[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean sudokuSolver(char[][] board, int row, int col) {
        // base case
        if(row == 9) {
            return true;
        }
        // internal work
        int nextRow = row, nextCol = col + 1;
        if(nextCol == 9) {
            nextRow++;
            nextCol = 0;
        }
        // recursion
        if(board[row][col] != '.') {
            return sudokuSolver(board, nextRow, nextCol);
        }
        for(char digit = '1'; digit <= '9'; digit++){
            if(isSafe(board, row, col, digit)) {
                board[row][col] = digit;
                if(sudokuSolver(board, nextRow, nextCol)) {
                    return true;
                }
                // else
                board[row][col] = '.';
            }
        }
        return false;
    }
    public void solveSudoku(char[][] board) {
        sudokuSolver(board, 0, 0);
    }
}