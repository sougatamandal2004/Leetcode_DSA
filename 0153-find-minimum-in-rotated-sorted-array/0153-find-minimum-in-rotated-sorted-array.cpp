class Solution {
public:
    int findMin(vector<int>& nums) {
        int n = nums.size();
        int i = 0, j = n-1;
        while(i < j) {
            int mid = i + (j - i)/2;
            if(nums[mid] > nums[j]){
                i = mid + 1;
            } else{
                j = mid; // mid -1 is not taken because there can be a chance that mid is the smallest one , so to track that and even also the while loop condition is i<j so if i == j then also the loop will break and the answer will become nums[i] as it refers to the left most point where the value is smaller one
            }
        }
        return nums[i];
    }
};