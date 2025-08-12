class Solution {
    public int majorityElement(int[] nums) {
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int num : nums){
        //     map.put(num, map.getOrDefault(num, 0) + 1);
        // }
        // int majorEle = -1;
        // int count = 0;
        // for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
        //     if(entry.getValue() > count){
        //         count = entry.getValue();
        //         majorEle = entry.getKey();
        //     }
        // }
        // return majorEle;




        // better approach without extra space and tc is O(n log n)
        // return majority(nums, 0, nums.length - 1);




        
        // this is the best approach
        // Boyer-Moore Voting Algorithm

        Integer candidate = null;
        int count = 0;
        for(int num : nums) {
            if(count == 0) {
                candidate = num;
                count++;
            }
            else if(candidate != num) {
                count--;
            }
            else count++;
        }
        // Verification step
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > nums.length / 2) {
            return candidate;
        } else {
            // No majority element
            return -1; // or throw exception or other error value
        }
    }
    // private static int majority(int[] nums, int si, int ei) {
    //     if(si == ei) {
    //         return nums[si];
    //     }
    //     // finding mid
    //     int mid = si + (ei - si) / 2;
    //     int left = majority(nums, si, mid);
    //     int right = majority(nums, mid + 1, ei);

    //     // checking both are equal or not
    //     if(left == right) {
    //         return left;
    //     }

    //     // checking whose count is greater
    //     int leftCount = count(nums, left, si, ei);
    //     int rightCount = count(nums, right, si, ei);

    //     // returning value
    //     return (leftCount > rightCount) ? left : right;
    // }

    // private static int count(int[] nums, int num, int si, int ei) {
    //     int count = 0;
    //     for(int i=si;i<=ei;i++){
    //         if(nums[i] == num) {
    //             count++;
    //         }
    //     }
    //     return count;
    // }
}