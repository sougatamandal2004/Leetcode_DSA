class Solution {
public:
    bool value(vector<vector<char>>& board, string &word, int m, int n, int x, int y, int p) {
        if (p == word.size())
        return true;

        if (x < 0 || y < 0 || x >= m || y >= n)
            return false;

        if (board[x][y] != word[p])
            return false;

        char temp = board[x][y];
        board[x][y] = '#';

        bool ans = value(board, word, m, n, x-1, y, p+1) || value(board, word, m, n, x, y-1, p+1) || value(board, word, m, n, x+1, y, p+1) || value(board, word, m, n, x, y+1, p+1);
        board[x][y] = temp;
        return ans;
    }
    bool exist(vector<vector<char>>& board, string word) {
        int m = board.size();
        int n = board[0].size();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (value(board, word, m, n, i, j, 0))
                    return true;
            }
        }
        return false;
    }
};