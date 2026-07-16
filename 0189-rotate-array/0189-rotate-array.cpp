class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        int n = nums.size();
        k %= n;
        queue<int> q;
        for(int i=n-k;i<n;i++){
            q.push(nums[i]);
        }
        for(int i=0;i<n-k;i++){
            q.push(nums[i]);
        }
        for(int i=0;i<n;i++){
            nums[i] = q.front();
            q.pop();
        }
    }
};