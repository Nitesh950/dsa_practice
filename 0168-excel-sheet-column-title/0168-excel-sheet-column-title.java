class Solution {
    public String convertToTitle(int columnNumber) {
		StringBuilder sb = new StringBuilder();
		
		while(columnNumber!=0) {
			int temp = columnNumber%26;
			
			if(temp == 0) {
				temp = 26;
				columnNumber -= 1;
			}	
			sb.append((char)('A' + temp - 1));
			
			columnNumber /= 26;
		}
		
		return sb.reverse().toString();
    }
}