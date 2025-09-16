class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        while(i<nums.length){
            int curr = nums[i];
            while(!list.isEmpty() && gcd(list.get(list.size() - 1), curr) > 1){
                int last = list.remove(list.size() - 1);
                curr = lcm(last, curr);
            }
            list.add(curr);
            i++;
        }
         return list;
    }
    private int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    private int lcm(int a, int b) {
        return (int)((long) a * b / gcd(a, b));
    }
}