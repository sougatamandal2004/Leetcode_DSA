class Solution {
    public int maxSum(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int output = 0;
        for(int num : set){
            if(num > 0){
                output += num;
            }
        }
        if(output <= 0) {
            output = Collections.max(set);
        }
        return output;
    }
}