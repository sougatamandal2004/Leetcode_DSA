class Solution {
public:
    vector<int> countBits(int n) {
        vector<int> v;
        v.push_back(0);
        for(int i=1;i<=n;i++){
            v.push_back(v[i/2]);
            if(i%2) v[i] += 1;

        }
        return v;
    }
};