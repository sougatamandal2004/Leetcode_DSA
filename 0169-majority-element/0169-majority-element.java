class Solution {
    public int majorityElement(int[] nums) {
        int num = Integer.MIN_VALUE;
        int cnt = 0;
        for(int i=0;i<nums.length;i++){
            if(cnt == 0){
                num = nums[i];
                cnt = 1;
            }
            else if(num == nums[i]){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        return num;
    }
}