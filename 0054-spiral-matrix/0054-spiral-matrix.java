class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int startRow = 0,startCol = 0, endRow = matrix.length - 1, endCol = matrix[0].length - 1;
        while(startRow <= endRow && startCol <= endCol){
            // traverse top row
            for(int i=startCol;i<=endCol;i++){
                list.add(matrix[startRow][i]);
            }
            startRow++;
            // traversing right col
            for(int i=startRow;i<=endRow;i++){
                list.add(matrix[i][endCol]);
            }
            endCol--;
            // traversing buttom row
            if(startRow <= endRow) {
            for(int i=endCol;i>=startCol;i--){
                list.add(matrix[endRow][i]);
            }
            endRow--;
            }
            // traversing left col
            if(startCol <= endCol) {
            for(int i=endRow;i>=startRow;i--){
                list.add(matrix[i][startCol]);
            }
            startCol++;
          }
        }
        return list;
    }
}