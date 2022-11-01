class Solution {
    public String convertToTitle(int columnNumber) {
		String ans = "";
		
		while(columnNumber!=0) {
			int temp = columnNumber%26;
			
			if(temp == 0) {
				temp = 26;
				columnNumber -= 1;
			}	
			ans += (char)('A' + temp - 1);
			
			columnNumber /= 26;
		}
		
		return reverse(ans);
    }
	public String reverse(String ans) {
		StringBuilder sb = new StringBuilder();
		for(int i=ans.length()-1; i>=0; i--) {
			sb.append(ans.charAt(i));
		}
		return sb.toString();
	}
}