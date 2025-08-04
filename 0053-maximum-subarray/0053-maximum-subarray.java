class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = nums[0];
        int maxSum = nums[0];
        for(int i=1;i<nums.length;i++){
            currSum = Math.max(currSum + nums[i], nums[i]);
            // if(currSum <= 0){
            //     currSum = 0;
            // }
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}