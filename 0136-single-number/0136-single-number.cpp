class Solution {
public:
    int singleNumber(vector<int>& nums) {
        unordered_map<int, int> map;
        int ans = 0;
        for(int num : nums){
            map[num]++;
        }
        for(auto it : map){
            if(it.second == 1) {
                ans = it.first;
                break;
            }
        }
        return ans;
    }
};