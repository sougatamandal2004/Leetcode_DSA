class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> list = new ArrayList<>();
        int n = graph.length;
        List<Integer> inner = new ArrayList<>();
        inner.add(0);
        calculateAllPaths(graph, 0, inner, list);
        return list;
    }

    private void calculateAllPaths(int[][] graph, int node, List<Integer> inner, List<List<Integer>> list) {
        if(node == graph.length-1){
            list.add(new ArrayList<>(inner));
            return;
        }
        for(int next : graph[node]){
            inner.add(next);
            calculateAllPaths(graph, next, inner, list);
            inner.remove(inner.size()-1);
        }
    }
}