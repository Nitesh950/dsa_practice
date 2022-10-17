class Solution {
    public static List<Integer> addToArrayForm(int[] num, int k) {
        int carry=0;
        List<Integer> result = new ArrayList<>();
        for(int i=num.length-1; i>=0; i--) {
        	int kVal = k%10;
        	int sum = (num[i] + kVal + carry);
        	
        	if(sum>=10) {
        		result.add(sum-10);
        		carry = sum/10;
        	}else {
        		result.add(sum);
        		carry=0;
        	}
        	
        	
        	k/=10;
        }
        if(k!=0) {
        	while(k!=0) {
            		int kVal = k%10;
            		int sum = kVal+carry;
            		if(sum>=10) {
                		result.add(sum-10);
                		carry = sum/10;
                	}else {
                		result.add(sum);
                		carry=0;
                	}	
            		k/=10;
        	}
        }
        if(carry!=0) {
        	result.add(carry);
        }
        Collections.reverse(result);
        return result;
    }
}