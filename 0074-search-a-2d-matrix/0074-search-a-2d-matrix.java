class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // this is from the top right corner
        // int row = 0;
        // int col = matrix[0].length - 1;
        // while(row < matrix.length && col >= 0){
        //     if(matrix[row][col] == target){
        //         return true;
        //     }
        //     else if(matrix[row][col] < target){
        //         row++;
        //     }
        //     else col--;
        // }
        // return false;



        // this is form the buttom-left corner
        int row = matrix.length - 1;
        int col = 0;
        while(row >= 0 && col < matrix[0].length){
            if(matrix[row][col] == target) {
                return true;
            }
            else if(matrix[row][col] > target){
                row--;
            }
            else{
                col++;
            }
        }
        return false;
    }
}