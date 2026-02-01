class Solution {
public:
    int reverseBits(int n) {
        int ans = 0;
        for(int i=0;i<=31;i++){
            int x = n&1;
            ans = (ans << 1) | x;
            n >>= 1;
        }
        return ans;
    }
};