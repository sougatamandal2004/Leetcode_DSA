class Solution {
public:
    int maxPoints(vector<vector<int>>& points) {
        int n = points.size();
        if(n <= 2) return n;
        int result = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int cnt = 2;
                int dy = points[j][1] - points[i][1];
                int dx = points[j][0] - points[i][0];

                for(int k = 0; k<n;k++){
                    if(k == i || k == j) continue;
                    int dy_ = points[k][1] - points[i][1];
                    int dx_ = points[k][0] - points[i][0];

                    // calculating slope
                    if(dy*dx_ == dy_*dx){
                        cnt++;
                    }
                }
                result = max(result, cnt);
            }
        }
        return result;
    }
};