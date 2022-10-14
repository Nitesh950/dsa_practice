class Solution {
     public boolean findRotation(int[][] mat, int[][] target) {
	     //find transpose
 	     
	        for(int k=0; k<4; k++){
	            rotate(mat);
	            if(check(mat, target)) return true;
	        }
	    return false;
	    }
    public boolean check(int[][] mat, int[][] target){
        for(int i =0; i<mat.length; i++) {
 	        	for(int j=0; j<mat[i].length; j++) {
 	        		if(mat[i][j] != target[i][j]) {
 	        			return false;
 	        		}
 	        	}
 	        }
        return true;
    }
	    public  void rotate(int[][] matrix){
	        //find transpose
	        //rotate each row
	        
	        for(int i=0; i<matrix.length; i++){
	            for(int j=i; j<matrix[i].length; j++){
	                int temp = matrix[i][j];
	                matrix[i][j] = matrix[j][i];
	                matrix[j][i] = temp;
	            }
	        }
	        for(int[] row: matrix){
	            reverse(row);
	        }
	    
	    }
	    public  void reverse(int[] row){
	        int i=0, j=row.length-1;
	        
	        while(i<j){
	            int temp = row[j];
	            row[j] = row[i];
	            row[i] = temp;
	            
	            i++;
	            j--;
	        }
	    }
	
}