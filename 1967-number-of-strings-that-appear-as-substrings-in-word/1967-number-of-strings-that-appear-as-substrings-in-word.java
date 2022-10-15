class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for(String string: patterns){
            if(checkStrings(string, word)){
                count++;
            }
        }
        return count;
    }
	public boolean checkStrings(String sub, String word){
        int i=0;
        while(i<word.length()){
            if(i+sub.length()>word.length()) return false;
            if(word.charAt(i)==sub.charAt(0)){
                if(check(sub, word.substring(i, i+sub.length()))){
                    return true;
                }
            }
                i++;
        }
        return false;
    }
    public boolean check(String s1, String s2){
        int i=0,j=0;
        while(i<s1.length() && j<s2.length()){
            if(s1.charAt(i)!=s2.charAt(j)){
                return false;
            }else{
                i++;
                j++;
            }
        }
        return true;
    }
}