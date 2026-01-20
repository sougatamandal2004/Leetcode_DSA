class Solution {
    public int findPeakElement(int[] nums) {
        int i = 1, j = nums.length - 2;
        int n = nums.length;
        if(n == 1) return 0;
        if(nums[0] > nums[1]) return 0;
        if(nums[n-1] > nums[n-2]) return n-1;
        while(i <= j){
            int mid = i + (j-i)/2;
            if((nums[mid] > nums[mid-1]) && (nums[mid] > nums[mid+1])){
                return mid;
            } else if(nums[mid] > nums[mid+1]){
                j = mid - 1;
            }
            else{
                i = mid + 1;
            }
        }
        return -1;
    }
}