class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> list = new ArrayList<>();
        int x = 0;
        for(int bit : nums){
            x = (x*2 + bit) % 5;
            list.add(x == 0);
        }
        return list;
    }
}