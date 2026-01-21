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
                    sum -= nums[i];
                    i++;
                }
                ans = Math.min(ans, j - i + 1+1);
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}