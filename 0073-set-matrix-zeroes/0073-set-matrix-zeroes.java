class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j] == 0){
                    ArrayList<Integer> pair = new ArrayList<>();
                    pair.add(i);
                    pair.add(j);
                    list.add(pair);
                }
            }
        }
        for(ArrayList<Integer> pair : list){
            int a = pair.get(0);
            int b = pair.get(1);
            for(int i=0;i<m;i++){
                matrix[a][i] = 0;
            }
            for(int j=0;j<n;j++){
                matrix[j][b] = 0;
            }
        }
    }
}