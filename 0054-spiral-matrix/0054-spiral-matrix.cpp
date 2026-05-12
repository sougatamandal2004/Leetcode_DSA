class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        vector<int> ans;
        int rs = 0, re = matrix.size() - 1;
        int cs = 0, ce = matrix[0].size() - 1;
        while(rs <= re && cs <= ce) {
            // traverse the top row
            for(int j=cs;j<=ce;j++) {
                ans.push_back(matrix[rs][j]);
            }
            rs++;
            // traverse the end column
            for(int i=rs;i<=re;i++) {
                ans.push_back(matrix[i][ce]);
            }
            ce--;
            // traverse the buttom row
            if(rs <= re) {
                for(int j=ce;j>=cs;j--){
                    ans.push_back(matrix[re][j]);
                }
                re--;
            }
            // traverse the left row
            if(cs <= ce) {
                for(int i=re;i>=rs;i--){
                    ans.push_back(matrix[i][cs]);
                }
                cs++;
            }
        }
        return ans;
    }
};