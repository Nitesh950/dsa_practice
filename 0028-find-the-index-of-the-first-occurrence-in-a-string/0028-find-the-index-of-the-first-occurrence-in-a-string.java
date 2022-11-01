class Solution {
    public int strStr(String haystack, String needle) {
        int i = 0;
        while(i<(haystack.length()-needle.length() + 1)){
            if(needle.charAt(0) == haystack.charAt(i)){
                 if(check(needle, haystack.substring(i, i+needle.length()))){
                     return i;
                 }else{
                     i++;
                 }
                
            }
            else{
                i++;
            }  
        }
        return -1;
    }
    public boolean check(String s1, String s2){
        if(s1.equals(s2)){
            return true;
        }else{
            return false;
        }
    }
}