class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        int n = nums.length;
        for(int i=0;i<=31;i++){
            int cnt = 0;
            for(int j=0;j<n;j++){
                if(((nums[j]>>i) & 1) == 1) cnt++;
            }
            if(cnt%3 != 0) ans = ans | (1<<i);
        }
        return ans;
    }
}