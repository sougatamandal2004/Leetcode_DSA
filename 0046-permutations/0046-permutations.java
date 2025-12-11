class Solution {
    private void generateParmutation(int[] nums, List<List<Integer>> list, List<Integer> innerList, boolean[] used){
        if(innerList.size() == nums.length){
            list.add(new ArrayList<>(innerList));
            // innerList.clear();
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]) continue;
            innerList.add(nums[i]);
            used[i] = true;
            generateParmutation(nums, list, innerList, used);
            innerList.remove(innerList.size() - 1);
            used[i] = false;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        if(nums.length == 0) return list;
        List<Integer> innerList = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        generateParmutation(nums, list, innerList, used);
        return list;
    }
}