class Solution {
    public int maxSubArray(int[] nums) {
        //brute force
        // int maxSum = Integer.MIN_VALUE;
        // int len = nums.length;
        // for(int i=0;i<len;i++){
        //     int s = i;
        //     for(int j=i;j<len;j++){
        //         int e = j;
        //         int currSum = 0;
        //         for(int k=s;k<=e;k++){
        //             currSum += nums[k];
        //         }
        //         if(currSum > maxSum){
        //             maxSum = currSum;
        //         }
        //     }
        // }
        // return maxSum;


        // Optimal -> Kadane's algorithm
        int maxSum = nums[0];
        int currSum = 0;
        for(int i=0;i<nums.length;i++){
            currSum += nums[i];
            maxSum = Math.max(currSum, maxSum);
            if(currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }
}