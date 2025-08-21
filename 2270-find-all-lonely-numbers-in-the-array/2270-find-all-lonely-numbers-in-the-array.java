class Solution {
    public List<Integer> findLonely(int[] nums) {
        // List<Integer> list = new ArrayList<>();
        // // brute force => using double for loop => TC = O(n^2)
        // Arrays.sort(nums);
        // int len = nums.length;
        // if(len == 0) return list;
        // if(len == 1) {
        //     list.add(nums[0]);
        //     return list;
        //     }
        // for(int i=1;i<nums.length-1;i++) {
        //     if((nums[i-1] + 1 < nums[i]) && (nums[i] + 1 < nums[i+1])){
        //         list.add(nums[i]);
        //     }
        // }
        // if(nums[0] + 1 < nums[1]){
        //     list.add(nums[0]);
        // }
        // if(nums[len - 2] + 1 < nums[len - 1]){
        //     list.add(nums[len-1]);
        // }
        // return list;


        int max = nums[0];
        for(int num: nums){
            if(num > max){
                max = num;
            }
        }
        int[] map = new int[max+2];
        for (int num : nums) {
            map[num]++;
        }
        List<Integer> res = new ArrayList<>();
		for (int num : nums) {
            if (map[num] == 1 && (num==0 || map[num-1]==0) && map[num+1]==0) {
                res.add(num);
            }
        }
        return res;
    }
}