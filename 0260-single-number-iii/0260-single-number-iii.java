class Solution {
    public int[] singleNumber(int[] nums) {
        int x = 0, y = 0, n = nums.length, xor = 0;
        for(int i=0;i<n;i++){
            xor ^= nums[i];
        }
        int lastSetBit = xor & (~(xor-1));
        for(int i=0;i<n;i++){
            if((lastSetBit & nums[i]) != 0) x ^= nums[i];
            else y ^= nums[i];
        }
        int ans[] = new int[2];
        ans[0] = x;
        ans[1] = y;
        return ans;
    }
}