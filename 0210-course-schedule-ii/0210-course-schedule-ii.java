class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i=0;i<numCourses;i++) {
            adj.add(new ArrayList<>());
        }
        int[] indegree = new int[numCourses];
        for (int[] prerequisite:prerequisites) {
            int a = prerequisite[0];
            int b = prerequisite[1];
            adj.get(b).add(a);
            indegree[a]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int i=0;i<numCourses;i++) {
            if (indegree[i]==0) {
                queue.add(i);
            }
        }
        int[] topo = new int[numCourses];
        int i = 0;
        while (!queue.isEmpty()) {
            int curr = queue.poll();
            topo[i++] = curr;
            for (int node:adj.get(curr)) {
                indegree[node]--;
                if (indegree[node]==0) {
                    queue.add(node);
                }
            }
        }
        return i==numCourses?topo:new int[]{};
    }
}