class Solution {
    public boolean isBipartite(int[][] graph) {
        int col[] = new int[graph.length];
        for(int i=0;i<graph.length;i++){
            col[i] = -1;
        }
        
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<graph.length;i++){ // // traversing the graph if having multiple components
            if(col[i] == -1){
                col[i] = 0;
                q.add(i);
                while(!q.isEmpty()){
                    int curr = q.remove();
                    for(int j=0;j<graph[curr].length;j++){
                        int nextCol = graph[curr][j];
                        if(col[nextCol] == -1){
                            col[nextCol] = col[curr] == 0 ? 1 : 0;
                            q.add(nextCol);
                        }
                        else if(col[nextCol] == col[curr]){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}