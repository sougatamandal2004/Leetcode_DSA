class Solution {
public:
    vector<int> maxSlidingWindow(vector<int>& nums, int k) {
        vector<int> ans;
        deque<int> dq;
        int n = nums.size();
        for(int i=0;i<n;i++){
            // removing the indices which are out of the bound
            while(!dq.empty() && i - dq.front() >= k){
                dq.pop_front();
            }
            // removing the elements which are smaller than the current element
            // and also maintain a strictly decreasing order
            while(!dq.empty() && nums[dq.back()] <= nums[i]){
                dq.pop_back();
            }
            dq.push_back(i);
            if(i >= k-1){
                ans.push_back(nums[dq.front()]);
            }
        }
        return ans;
    }
};