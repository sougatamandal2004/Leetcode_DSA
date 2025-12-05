class Solution {
    public int countPartitions(int[] nums) {
        int n = nums.length;
        int totSum = 0;
        for(int i=0;i<n;i++){
            totSum += nums[i];
        }
        int leftSum = 0;
        int cnt = 0;
        for(int i=0;i<n-1;i++){
            leftSum += nums[i];
            totSum -= nums[i];
            if((leftSum - totSum)%2 == 0) cnt++;
        }
        return cnt;
    }
}