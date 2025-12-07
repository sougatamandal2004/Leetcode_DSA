class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int ans[] = new int[numCourses];
        int indeg[] = new int[numCourses];
        // int outdeg[] = new int[numCourses];
        for(int i=0;i<prerequisites.length;i++){
            int x = prerequisites[i][0];
            // int y = prerequisites[i][1];
            indeg[x]++;
            // outdeg[x]++;
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<indeg.length;i++){
            if(indeg[i] == 0){
                q.add(i);
            }
        }
        // if(q.size() == 0) return ans;

        int idx = 0;
        while(!q.isEmpty()){
            int curr = q.remove();
            ans[idx++] = curr;
            for(int i=0;i<prerequisites.length;i++){
                if(prerequisites[i][1] == curr){
                    int x = prerequisites[i][0];
                    indeg[x]--;
                    if(indeg[x] == 0){
                        q.add(x);
                    }
                }
            }
        }
        if(idx != numCourses) return new int[0];
        return ans;
    }
}