class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int product = 1;
        int zeroCount = 0;
        for(int i=0;i<n;i++){
        if(nums[i] == 0) zeroCount++;
        product *= nums[i];
        }
        int[] ans = new int[nums.length];
        if(zeroCount >= 2){
            for(int i=0;i<n;i++){
                ans[i] = 0;
            }
        }
        else if(zeroCount == 1){
            int product1 = 1;
            for(int i=0;i<n;i++){
                if(nums[i] == 0) continue;
                else product1 *= nums[i];
            }
            for(int i=0;i<n;i++){
                if(nums[i] == 0){
                    ans[i] = product1;
                }
                else ans[i] = 0;
            }
        }
        else{
            for(int i=0;i<n;i++){
                ans[i] = (int)(product/nums[i]);
            }
        }
        return ans;
    }
}