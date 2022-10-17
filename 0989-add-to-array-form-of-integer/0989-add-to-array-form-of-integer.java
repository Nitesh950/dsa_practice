class Solution {
    public static List<Integer> addToArrayForm(int[] num, int k) {
        int carry=0;
        LinkedList<Integer> result = new LinkedList<>();
        
        int i=num.length-1;
        while(i>=0 || k!=0) {
        	int kVal = k%10;
        	int sum = kVal+carry;
        	if(i>=0) {
        		sum += num[i];
        	}
        	if(sum>=10) {
        		result.addFirst(sum-10);
        		carry = sum/10;
        	}else {
        		result.addFirst(sum);
        		carry=0;
        	}
        	i--;
        	k/=10;
        }
        if(carry!=0) {
        	result.addFirst(carry);
        }
        
        // Collections.reverse(result);
        return result;
    }
}