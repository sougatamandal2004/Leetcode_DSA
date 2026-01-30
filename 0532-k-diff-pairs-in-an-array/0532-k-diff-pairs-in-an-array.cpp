class Solution {
public:
    int findPairs(vector<int>& nums, int k) {
        int n = nums.size();
        int p1= 0, p2 = 1;
        sort(nums.begin(), nums.end());
        int cnt = 0;
        while(p1 < n && p2 < n){
            if((p1 == p2) || (nums[p2] - nums[p1] < k)){
                p2++;
            } else if(nums[p2] - nums[p1] > k){
                p1++;
            } else{
                cnt++;
                p1++;
                while(p1 < p2 && (nums[p1] == nums[p1-1])){
                    p1++;
                } 
            }
        }
        return cnt;
    }
};