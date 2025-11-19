// class Solution {
//     public int findFinalValue(int[] nums, int original) {
//         Set<Integer> st = new HashSet<>();
//         for (int x : nums) {
//             st.add(x);
//         }
//         for(int i=0;i<nums.length;i++){
//             if(st.contains(original)){
//                 original *= 2;
//             }
//         }
//         return original;
//     }
// }



class Solution {
    public int findFinalValue(int[] nums, int original) {
        return search(nums,original)?findFinalValue(nums,original*2):original;
    }
    public boolean search(int []nums,int target){
        for(int val:nums){
            if(val==target)return true;
        }
        return false;
    }
}