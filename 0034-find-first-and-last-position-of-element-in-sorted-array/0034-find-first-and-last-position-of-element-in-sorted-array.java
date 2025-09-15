class Solution {
    public int[] searchRange(int[] nums, int target) {
        int i=0,j=nums.length - 1;
        int x = -1, y = -1;
        while(i <= j){
            int mid = i + (j - i)/2;
            if(nums[mid] == target){
                x = mid;
                y = mid;
                break;
            }
            else if(nums[mid] > target){
                j = mid - 1;
            }
            else i = mid + 1;
        }
        if(x == -1){
            return new int[]{-1, -1};
        }
        while(x > 0 && nums[x-1] == nums[x]) x--;
        while(y < nums.length-1 && nums[y+1] == nums[y]) y++;
        return new int[]{x, y};
    }
}