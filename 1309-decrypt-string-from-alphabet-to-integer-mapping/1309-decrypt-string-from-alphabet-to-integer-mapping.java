class Solution {
    public String freqAlphabets(String s) {
        int i=0;
        StringBuilder ans = new StringBuilder();
        StringBuilder check = new StringBuilder();
        while(i<s.length()){
            if((i+2)< s.length() && s.charAt(i+2)== '#'){
                check.append(s.charAt(i));
                check.append(s.charAt(i+1));
                ans.append(convert(check.toString()));
                check = new StringBuilder();
                i=i+3;
            }
            else{
                ans.append((char)((s.charAt(i)- '0' -1)+ 97));
                i++;
            }
        }
        return ans.toString();
    }
    public char convert(String s){
        int a = 10* (s.charAt(0) - '0');
        int b = s.charAt(1) - '0';
        return (char)((a+b - 1) + 97);
    }
}