class Solution {
    public void findAllSubsets(int[] arr, List<List<Integer>> li, List<Integer> inner, int i){
        // base case
        if(i == arr.length) {
            li.add(new ArrayList<>(inner)); // store a copy of current subset
            return;
        }
        // yes choice
        inner.add(arr[i]);
        findAllSubsets(arr, li, inner, i+1);
        // backtrack
        inner.remove(inner.size() - 1);
        // no choice 
        findAllSubsets(arr, li, inner, i+1);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> li = new ArrayList<>();
        List<Integer> inner = new ArrayList<>();
        int i = 0;
        findAllSubsets(nums, li, inner, i);
        return li;
    }
}