class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int arr[] = new int[2];
        int x=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if(map.get(nums[i]) > 1){
                arr[x++] = nums[i];
            }
        }
        return arr;
    }
}