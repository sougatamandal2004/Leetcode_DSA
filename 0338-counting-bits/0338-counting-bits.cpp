class Solution {
public:
    vector<int> countBits(int n) {
        vector<int> v;
        v.push_back(0);
        v.push_back(1);
        if(n == 0) return {0};
        if(n == 1) return v;
        for(int i=2;i<=n;i++){
            if(i%2 == 0) {
                v.push_back(v[i/2]);
            } else{
                v.push_back(v[i/2] + 1);
            }
        }
        return v;
    }
};