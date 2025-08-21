class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean incr = true;
        boolean decr = true;
        for(int i=0;i<nums.length-1;i++) {
            // check incr
            if(nums[i] > nums[i+1]) {
                incr = false;
            }
            // check decr
            if(nums[i] < nums[i+1]) {
                decr = false;
            }
        }
        return incr || decr;
    }
}