class Solution {
    public int majorityElement(int[] nums) {
        int cnt = 0;
        int ans = -1;
        for(int num : nums){
            if(cnt == 0){
                cnt = 1;
                ans = num;
            } else if(num == ans){
                cnt++;
            } else cnt--;
        }
        return ans;
    }
}