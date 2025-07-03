class Solution {
    public int maxSubArray(int[] nums) {

        // O(n^2) time complexity
        // int n = nums.length;
        // int maxSum = Integer.MIN_VALUE;
        // for(int i=0;i<n;i++){
        //     int currSum = 0;
        //     for(int j=i;j<n;j++){
        //         currSum += nums[j];
        //         maxSum = Math.max(currSum, maxSum);
        //     }
        // }
        // return maxSum; // this is not workable in here cause it give time limit exceed for large size of array


        int maxSum = nums[0];
        int currSum = nums[0];
        for(int i=1;i<nums.length;i++){
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }
}