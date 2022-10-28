class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if((r*c)!=(mat.length * mat[0].length)) return mat;
        int[][] arr = new int[r][c];
        int x = 0, y=0;
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(y==mat[0].length){
                    x++;
                    y=0;
                }
                arr[i][j] = mat[x][y];
                y++;
            }
        }
        return arr;
    }
}