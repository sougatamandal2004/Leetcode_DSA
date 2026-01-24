class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int i=0, j=n-1;
        while(i < j){
            int x = nums[i] + nums[j];
            if(x == target) return new int[]{i+1, j+1};
            else if(x > target) j--;
            else i++;
        }
        return new int[]{};
    }
}