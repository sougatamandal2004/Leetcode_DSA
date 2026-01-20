class Solution {
    public int findMin(int[] nums) {
        int ans = Integer.MAX_VALUE;
        int i=0, j = nums.length - 1;
        while(i <= j){
            int mid = i + (j - i)/2;
            if(nums[i] <= nums[mid]){
                ans = Math.min(ans, nums[i]);
                i = mid + 1;
            } else{
                ans = Math.min(ans, nums[mid]);
                j = mid - 1;
            }
        }
        return ans;
    }
}