class Solution {
    public void sortColors(int[] nums) {
       for(int i=0;i<nums.length - 1;i++){
        boolean isSwap = false;
        int j = i+1;
        while(j > 0 && nums[j-1] > nums[j]) {
            int temp = nums[j];
            nums[j] = nums[j - 1];
            nums[j-1] = temp;
            j--;
        }
       }
    }
}