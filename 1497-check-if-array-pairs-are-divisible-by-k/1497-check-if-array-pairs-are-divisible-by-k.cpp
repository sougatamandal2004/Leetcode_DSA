class Solution {
public:
    bool canArrange(vector<int>& arr, int k) {
        int map[k];
        for(int i=0;i<k;i++){
            map[i] = 0;
        }
        for(int num : arr){
            int x = (num % k);
            if(x < 0) x = x + k;
            map[x]++;
        }
        if(map[0]%2 != 0) return false;
        for(int i=1;i<=k/2;i++){
            if(map[i] != map[k-i]) {
                return false;
            }
        }
        return true;
    }
};