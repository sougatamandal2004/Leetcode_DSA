class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;

        // reversing the whole array
        reverse(nums, 0, n-1);

        // reversing first k element
        reverse(nums, 0, k-1);

        // reversing the remaining part
        reverse(nums, k, n-1);
    }
    private void reverse(int[] arr, int si, int ei){
        while(si < ei){
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            si++;
            ei--;
        }
    }
}