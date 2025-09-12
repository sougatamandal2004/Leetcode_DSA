class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n-k+1];
        List<Integer> list = new ArrayList<>();
        int i=0,j=0;
        while(j < n){
            while(!list.isEmpty() && list.get(list.size() - 1) < nums[j]){ // removing from the right side
                list.remove(list.size() - 1);
            }
            list.add(nums[j]);
            if(j - i + 1 < k){
                j++;
            }
            else if(j - i + 1 == k) {
                int x = list.get(0);
                ans[i] = x;
                if(x == nums[i]){
                    list.remove(0);
                }
                i++;
                j++;
            }
        }
        return ans;
    }
}