class Solution {
public:
    void setZeroes(vector<vector<int>>& matrix) {
        int m = matrix.size();
        int n = matrix[0].size();
        vector<pair<int, int>> v;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++) {
                if(matrix[i][j] == 0) v.push_back({i, j});
            }
        }
        for(int i=0;i<v.size();i++) {
            // convert row to 0
            int x = v[i].first;
            for(int j=0;j<n;j++){
                matrix[x][j] = 0;
            }

            // convert col to 0
            int y = v[i].second;
            for(int j=0;j<m;j++){
                matrix[j][y] = 0;
            }
        }
    }
};