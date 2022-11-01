class Solution {
    public String convertToTitle(int columnNumber) {
		String ans = "";
		
		while(columnNumber!=0) {
			int temp = columnNumber%26;
			
			if(temp == 0) {
				temp = 26;
				columnNumber -= 1;
			}	
			ans = (char)('A' + temp - 1)+ ans;
			
			columnNumber /= 26;
		}
		
		return ans;
    }
}