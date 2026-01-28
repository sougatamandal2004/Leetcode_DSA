class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
           set.add(num);
        }
        int longestStreak = 0;
        for(int num : set){
            if(!set.contains(num - 1)){
                // int num = nums[i];
                int currStreak = 1;
                while(set.contains(num+1)){
                    num++;
                    currStreak++;
                }
                longestStreak = Math.max(longestStreak, currStreak);
            }
        }
        return longestStreak;
    }
}