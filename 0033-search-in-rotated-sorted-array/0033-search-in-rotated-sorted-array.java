class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int i = 0, j = n - 1;
        int ans = -1;
        while(i <= j) {
            int mid = i + (j - i) / 2;
            if(nums[mid] == target){
                ans = mid;
                break;
            }
            else if(nums[i] <= nums[mid]){
                if(nums[i] <= target && target < nums[mid]){
                    j = mid - 1;
                } else{
                    i = mid + 1;
                }
            }
            else{
                if(nums[mid] < target && target <= nums[j]){
                    i = mid + 1;
                }
                else{
                    j = mid - 1;
                }
            }
        }
        return ans;
    }
}