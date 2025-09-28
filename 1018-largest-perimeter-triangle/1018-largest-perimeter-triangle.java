class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int per = 0;
        for(int a=n-1;a>=2;a--){
            for(int b=a-1;b>=1;b--){
                for(int c=b-1;c>=0;c--){
                    if(nums[a] < (nums[b] + nums[c])){
                        return (nums[a] + nums[b] + nums[c]);
                    }
                }
            }
        }
        return 0;
    }
}