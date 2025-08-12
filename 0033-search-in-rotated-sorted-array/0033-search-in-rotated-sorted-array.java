class Solution {
    public int check(int[] nums, int target, int si, int ei){
        if(si > ei) return -1;
        int mid = si + (ei - si) / 2;
        if(nums[mid] == target) return mid;
        // 1st condition
        if(nums[si] <= nums[mid]) {
            if(nums[si] <= target && target <= nums[mid]){
                return check(nums, target, si, mid);
            }
            else{
                return check(nums, target, mid+1, ei);
            }
        }
        // 2nd condition
        else{
            if(nums[mid] <= target && target <= nums[ei]){
                return check(nums, target, mid, ei);
            }
            else {
                return check(nums, target, si, mid - 1);
            }
        }
    }
    public int search(int[] nums, int target) {
        int si = 0;
        int ei = nums.length - 1;
        return check(nums, target, si, ei);
    }
}