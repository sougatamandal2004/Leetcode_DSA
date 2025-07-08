class Solution {
public:
    int firstMissingPositive(vector<int>& nums) {
     // This index-based cyclic sort or index mapping technique is a powerful pattern used in a variety of problems — especially when:

     // You're dealing with an array of size n containing values in the range [1, n].

     // its time complexity is O(n)

     int n = nums.size();
     for(int i=0;i<n;i++){
        while(nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]){
            swap(nums[i], nums[nums[i] - 1]);
        }
     }

     for(int i=0;i<n;i++){
        if(nums[i] != i + 1){
            return i + 1;
        }
     }
     return n + 1;
    }
};