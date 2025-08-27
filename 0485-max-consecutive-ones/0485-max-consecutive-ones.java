class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int count = 0;
        int prevCount = 0;
        int x = 0;
        for(int i=0;i<n;i++){
            if(nums[i] == 1){
                if(x == 0) x = 1;
                count = count+1;
            }
            else{
                x = 0;
                prevCount = Math.max(prevCount, count);
                count = 0;
            }
        }
        return Math.max(count, prevCount);
    }
}