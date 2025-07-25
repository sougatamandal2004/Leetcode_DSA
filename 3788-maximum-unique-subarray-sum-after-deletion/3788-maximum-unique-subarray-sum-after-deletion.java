class Solution {
    public int maxSum(int[] nums) {
        // HashSet<Integer> set = new HashSet<>();
        // for(int num : nums){
        //     set.add(num);
        // }
        // int output = 0;
        // for(int num : set){
        //     if(num > 0){
        //         output += num;
        //     }
        // }
        // if(output <= 0) {
        //     output = Collections.max(set);
        // }
        // return output;


        // best approach
        Arrays.sort(nums);
        int prev = nums[nums.length - 1];
        int sum = prev;
        for (int i = nums.length - 2; i >= 0; i--) {
            int n = nums[i];
            if (n <= 0) {
                return sum;
            } else if (n != prev) {
                sum = sum + n;
            }
            prev = n;
        }
        return sum;
    }
}