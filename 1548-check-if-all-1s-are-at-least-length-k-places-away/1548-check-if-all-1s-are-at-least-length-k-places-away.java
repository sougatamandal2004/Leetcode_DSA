class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int n = nums.length;
        int i=0;
        boolean flag = true;
        while(i < n && nums[i] != 1){
            i++;
        }
        int fp = i;
        for(int x = fp+1;x<n;x++){
            if(nums[x] == 1){
                if(x-fp-1 < k){
                    flag = false;
                    break;
                }
                else{
                    fp = x;
                }
            }
        }
        return flag;
    }
}