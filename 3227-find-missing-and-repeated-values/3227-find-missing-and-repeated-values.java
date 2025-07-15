class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] arr = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        int r = grid.length;
        int c = grid[0].length;
        int number = r*c;
        int val = number*(number+1)/2;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                map.put(grid[i][j], map.getOrDefault(grid[i][j], 0) + 1);
                if(map.get(grid[i][j]) == 2){
                    arr[0] = grid[i][j];
                }
                else{
                    val -= grid[i][j];
                }
            }
        }
        arr[1] = val;
        return arr;
    }
}