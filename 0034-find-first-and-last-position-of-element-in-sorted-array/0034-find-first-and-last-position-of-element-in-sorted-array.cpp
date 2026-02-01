class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        int n = nums.size();
        int i=0, j = n -1;
        int start = -1, end = -1;
        while(i <= j){
            int mid = i + (j - i)/2;
            if(nums[mid] == target){
                start = end = mid;
                while(start > 0 && nums[start] == nums[start-1]) start--;
                while(end < n-1 && nums[end] == nums[end+1]) end++;
                break;
            } else if(nums[mid] > target){
                j = mid - 1;
            } else i = mid + 1;
        }
        return {start, end};
    }
};