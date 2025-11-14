class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] ans = new int[n][n];
        int row1 = -1, col1 = -1, row2 = -1, col2 = -1;
        for(int i=0;i<queries.length;i++){
            row1 = queries[i][0];
            col1 = queries[i][1];
            row2 = queries[i][2];
            col2 = queries[i][3];
            for(int x = row1;x<=row2;x++){
                for(int y=col1;y<=col2;y++){
                    ans[x][y] += 1;
                }
            }
        }
        return ans;
    }
}