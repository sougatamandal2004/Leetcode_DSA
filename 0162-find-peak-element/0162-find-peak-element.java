class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length == 1) return 0;
        int idx = -1;
        int num = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > num){
                num = nums[i];
                idx = i;
            }
        }
        return idx;
    }
}