class Solution {
    public String reverseWords(String s) {
        String [] arr= s.split(" ");
        String[] nums = new String[arr.length];
        int i=0;
        for(String val: arr){
            String str = reverse(val);
            nums[i] = str;
            i++;
        }
        StringBuilder sb = new StringBuilder();
        for(String val: nums){
            sb.append(val + " ");
        }
        return sb.toString().trim();
    }
    public String reverse(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
