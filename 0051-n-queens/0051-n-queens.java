class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> list = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = '.';
            }
        }
        int row = 0;
        nQueens(board, row, list);
        return list;
    }
    private void nQueens(char[][] board, int r, List<List<String>> list) {
        // base case
        if(r == board.length){
            List<String> inner = new ArrayList<>();
            for(char[] row : board){
                inner.add(new String(row));
            }
            list.add(inner);
            return;
        }

        // condition => column traversal
        for(int j=0;j<board.length;j++){
            if(isSafe(board, r, j)) {
                board[r][j] = 'Q';
                nQueens(board, r+1, list);
                board[r][j] = '.'; // backtracking
            }
        }
    }

    private boolean isSafe(char[][] board, int row, int col){
        // vertical check
        for(int i=row-1;i>=0;i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        // diagonally left top
        for(int i=row-1,j=col-1; i>=0 && j>= 0; i--,j--){
            if(board[i][j] == 'Q') {
                return false;
            }
        }
        // diagonally right top
        for(int i=row-1,j=col+1; i>=0 && j<board[0].length; i--,j++){
            if(board[i][j] == 'Q') {
                return false;
            }
        }
        // else
        return true;
    }
}