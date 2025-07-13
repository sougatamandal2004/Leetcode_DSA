class Solution {
    public void sortColors(int[] nums) {
       int zero = 0, one = 0, two = 0;
       for(int i=0;i<nums.length;i++){
        if(nums[i] == 0) zero++;
        else if(nums[i] == 1) one++;
        else two++;
       }
       int x = 0;
       for(int i=0;i<zero;i++){
        nums[x++] = 0;
       }
       for(int i=0;i<one;i++){
        nums[x++] = 1;
       }
       for(int i=0;i<two;i++){
        nums[x++] = 2;
       }
    }
}