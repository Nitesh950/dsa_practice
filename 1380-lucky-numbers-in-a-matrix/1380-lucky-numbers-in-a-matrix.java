class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(checkRow(matrix, i, matrix[i][j]) && checkCol(matrix, j, matrix[i][j])){
                    result.add(matrix[i][j]);
                    break;
                }
            }
        }
        return result;
    }
    
    public boolean checkRow(int [][] matrix,int row, int val){
            for(int j=0;j<matrix[row].length;j++){
                if(matrix[row][j]<val){
                    return false;
                }
            }
        return true;
    }
    public boolean checkCol(int [][] matrix,int col, int val){
            for(int i=0;i<matrix.length;i++){
                if(matrix[i][col]>val){
                    return false;
                }
            }
        return true;
    }
}