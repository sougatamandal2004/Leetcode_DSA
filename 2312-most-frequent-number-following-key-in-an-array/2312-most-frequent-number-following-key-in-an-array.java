class Solution {
    public int mostFrequent(int[] nums, int key) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] == key) {
                map.put(nums[i+1], map.getOrDefault(nums[i+1], 0) + 1);
            }
        }
        int ans = -1;
        int freq = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int k = entry.getKey();
            int value = entry.getValue();
            if(value > freq) {
                freq = value;
                ans = k;
            }
        }
        return ans;
    }
}