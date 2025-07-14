class Solution {
    public int[] numberOfPairs(int[] nums) {
        int[] arr = new int[2];
        List<Integer> list = new ArrayList<>();
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(list.contains(nums[i])){
                count++;
                list.remove(Integer.valueOf(nums[i]));
            }
            else list.add(nums[i]);
        }
        arr[0] = count;
        arr[1] = (nums.length - 2*count);
        return arr;
    }
}