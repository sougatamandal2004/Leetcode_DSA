class Solution {
public:
    int singleNumber(vector<int>& nums) {
        unordered_map<int, int> map;
        for(int num : nums){
            map[num]++;
        }
        int ans = -1;
        for(auto it : map){
            if(it.second == 1){
                ans = it.first;
                break;
            }
        }
        return ans;
    }
};