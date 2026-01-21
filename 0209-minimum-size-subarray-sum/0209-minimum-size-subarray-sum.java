class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0;
        int n = nums.length;
        int sum = 0;
        int ans = Integer.MAX_VALUE;
        for(int j=0;j<n;j++){
            sum += nums[j];
            if(sum >= target){
                while(sum >= target){
                    ans = Math.min(ans, j - i + 1); // but this one is much better than the below one cause here we don't go out extra index which is not present in the array
                    sum -= nums[i];
                    i++;
                }
                //  ans = Math.min(ans, j - i + 1+1); // => if we take here this will also work
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}