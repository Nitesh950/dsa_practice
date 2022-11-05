class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<Integer>();
        int rowStart = 0;
        int colStart = 0;
        int rowEnd = matrix.length-1;
        int colEnd = matrix[0].length-1;
        int size = matrix.length * matrix[0].length;
        while(ans.size() < size){
            for(int i=rowStart, j=colStart; j<=colEnd; j++){
                ans.add(matrix[i][j]);
            }
            rowStart++;
            if(ans.size() == size) break;
            for(int i=rowStart, j=colEnd; i<=rowEnd; i++){
                ans.add(matrix[i][j]);
            }
            colEnd--;
            if(ans.size() == size) break;
            for(int i=rowEnd, j=colEnd; j>=colStart; j--){
                ans.add(matrix[i][j]);
            }
            rowEnd--;
            if(ans.size() == size) break;
            for(int i=rowEnd, j=colStart; i>=rowStart; i--){
                ans.add(matrix[i][j]);
            }
            colStart++;
            if(ans.size() == size) break;
        }

        return ans;
    }
}