class Solution {
    public static boolean isPalindrome(String s) {
	        int i=0, j=s.length()-1;
	        
	        while(i<j){
	        	char ch1 = s.charAt(i);
		        char ch2 = s.charAt(j);
	            if(!isValid(ch1) || !isValid(ch2)){
	                if(!isValid(ch1)){    
	                    i++;
	                    continue;
	                }
	                if(!isValid(ch2)){
	                    j--;
	                    continue;
	                }
	            }
	            if(ch1>='A' && ch1<='Z') {
	            	ch1 = (char)(ch1 - 'A' + 'a');
	            }
	            if(ch2>='A' && ch2<='Z') {
	            	ch2 = (char)(ch2 - 'A' + 'a');
	            }
	            if(ch1!=ch2) {
	            	return false;
	            }
	            else{
	                i++;
	                j--;
	            }
	            
	        }
	        return true;
	    }
	    public static boolean isValid(char ch){
	        if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9')){
	        	return true;
	        }
	        return false;
	    }
}