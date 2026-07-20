class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        if(nums.size() == 0) return 0;
        unordered_set<int> st;
        int min = INT_MAX;
        int ans = 1;
        for(int num : nums){
            st.insert(num);
        }
        for(auto it : st) {
            int cnt = 0;
            if(st.find(it - 1) == st.end()){
                min = it;
                cnt = 1;
                while(st.find(min+1) != st.end()){
                    cnt++;
                    min++;
                }
                ans = max(ans, cnt);
            }
        }
        return ans;
    }
};