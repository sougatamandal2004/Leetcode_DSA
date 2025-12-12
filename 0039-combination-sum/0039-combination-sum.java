class Solution {
    private void calculate(int[] candidates, int idx, int curr, int target, List<Integer> inner, List<List<Integer>> list){
        if(curr == target){
            list.add(new ArrayList<>(inner));
            return;
        }
        else if(curr > target){
            return;
        }
        for(int i=idx;i<candidates.length;i++){
            inner.add(candidates[i]);
            calculate(candidates, i, curr + candidates[i], target, inner, list);
            inner.remove(inner.size() - 1);
        }
        
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        List<Integer> inner = new ArrayList<>();
        calculate(candidates, 0, 0, target, inner, list);
        return list;
    }
}