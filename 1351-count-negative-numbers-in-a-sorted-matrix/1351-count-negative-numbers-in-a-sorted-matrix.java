class Solution {
    public int countNegatives(int[][] grid) {
        int res = 0;
        int i=0,j=0;
        while(i<grid.length){
            while(j<grid[i].length){
                if(grid[i][j] < 0){
                    res += (grid[i].length-j);
                    break;
                }else{
                    j++;
                }
            }
            j=0;
            i++;
        }
        return res;
        
    }
}