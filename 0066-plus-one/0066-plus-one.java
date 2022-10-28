class Solution {
    public int[] plusOne(int[] digits) {
     int[] dummy = new int[digits.length];
        int carry = 0;
        int i=digits.length-1;
        while(i>=0){
            int sum = digits[i] + carry;
            if(i==digits.length-1){
                sum += 1;
            }
            carry = sum/10;
            sum = sum%10;
            dummy[i] = sum;
            i--;
        }
        int[] res = new int[dummy.length+1];
        if(carry!=0){
            res[0] = carry;
            for(int j=0; j<dummy.length; j++){
                res[j+1] = dummy[j];
            }
            return res;
        }
        
        return dummy;
    }
}