class Solution {
public:
    int minElement(vector<int>& nums) {
        int n = nums.size();
        int mini = INT_MAX;
        for(int num : nums){
            int x = 0;
            while(num){
                x += num%10;
                num/=10;
            }
            mini = min(mini, x);
        }
        return mini;
    }
};