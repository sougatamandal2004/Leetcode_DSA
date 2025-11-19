class Solution {
    public int findFinalValue(int[] nums, int original) {
        Set<Integer> st = new HashSet<>();
        for (int x : nums) {
            st.add(x);
        }
        for(int i=0;i<nums.length;i++){
            if(st.contains(original)){
                original *= 2;
            }
        }
        return original;
    }
}