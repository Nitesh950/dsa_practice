class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==1) return nums[0];
        //try two-pointers?
        int i=0;
        int j=nums.length-1;
        int count = 0;
        while(i<=j){
            int val1 = nums[i];
            int val2 = nums[j];
            
            while(nums[i] == val1){
                count++;
                i++;
            }
            if(count == 1) return nums[i-1];
            count = 0;
            while(nums[j] == val2){
                count++;
                j--;
            }
            if(count == 1) return nums[j+1];
            count = 0;
        }
        return count;
    }
}