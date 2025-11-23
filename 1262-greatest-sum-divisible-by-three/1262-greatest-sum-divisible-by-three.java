class Solution {
    public int maxSumDivThree(int[] nums) {
        int sum = 0;
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        
        for(int num : nums){
            sum += num;
            if(num%3 == 1) list1.add(num);
            else if(num%3 == 2) list2.add(num);
        }

        if(sum % 3 == 0) return sum;

        Collections.sort(list1);
        Collections.sort(list2);

        int rem = sum%3;
        int ans = 0;
        if(rem == 1){
            int op1 = (list1.size() >= 1) ? sum - list1.get(0) : 0;
            int op2 = (list2.size() >= 2) ? sum - list2.get(0) - list2.get(1) : 0;
            ans = Math.max(op1, op2);
        } else{
            int op1 = (list2.size() >= 1) ? sum - list2.get(0) : 0;
            int op2 = (list1.size() >= 2) ? sum - list1.get(0) - list1.get(1) : 0;
            ans = Math.max(op1, op2);
        }
        return ans;
    }
}