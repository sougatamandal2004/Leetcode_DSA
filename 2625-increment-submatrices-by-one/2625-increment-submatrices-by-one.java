class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        // int[][] ans = new int[n][n];
        // int row1 = -1, col1 = -1, row2 = -1, col2 = -1;
        // for(int i=0;i<queries.length;i++){
        //     row1 = queries[i][0];
        //     col1 = queries[i][1];
        //     row2 = queries[i][2];
        //     col2 = queries[i][3];
        //     for(int x = row1;x<=row2;x++){
        //         for(int y=col1;y<=col2;y++){
        //             ans[x][y] += 1;
        //         }
        //     }
        // }
        // return ans; // this is brute force solution 

        // Optimal Solution
        int[][] diff = new int[n + 1][n + 1];

        // Apply difference updates
        for (int[] q : queries) {
            int r1 = q[0], c1 = q[1];
            int r2 = q[2], c2 = q[3];

            diff[r1][c1] += 1;
            diff[r1][c2 + 1] -= 1;
            diff[r2 + 1][c1] -= 1;
            diff[r2 + 1][c2 + 1] += 1;
        }

        // Build prefix sum to get final matrix
        int[][] ans = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int top = (i > 0) ? ans[i - 1][j] : 0;
                int left = (j > 0) ? ans[i][j - 1] : 0;
                int diag = (i > 0 && j > 0) ? ans[i - 1][j - 1] : 0;

                ans[i][j] = diff[i][j] + top + left - diag;
            }
        }
        return ans;
    }
}