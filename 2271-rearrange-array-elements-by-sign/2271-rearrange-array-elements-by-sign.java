class Solution {
    public int[] rearrangeArray(int[] nums) {
        // int n = nums.length;
        // int[] ans = new int[nums.length];
        // ArrayList<Integer> list1 = new ArrayList<>();
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i] >= 0){
        //         list1.add(nums[i]);
        //     }
        // }
        // ArrayList<Integer> list2 = new ArrayList<>();
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i] < 0){
        //         list2.add(nums[i]);
        //     }
        // }
        // int x = 0;
        // for(int i=0;i<list1.size();i++){
        //     ans[x++] = list1.get(i);
        //     ans[x++] = list2.get(i);
        // }
        // return ans;

        int[] ans = new int[nums.length];
        int x = 0, y = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] >= 0){
                ans[2*x] = nums[i];
                x++;
            }
            else{
                ans[2*y+1] = nums[i];
                y++;
            }
        }
        return ans;
    }
}