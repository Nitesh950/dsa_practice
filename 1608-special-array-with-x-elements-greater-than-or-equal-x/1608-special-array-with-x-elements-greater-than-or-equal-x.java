class Solution {
    public int specialArray(int[] nums) {
        int low = 0;
        int high = nums.length;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(noOfElements(nums, mid) == mid){
                return mid;
            }
            else if(noOfElements(nums, mid) > mid){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }

    public int noOfElements(int[] arr, int num){
        int count = 0;
        for(int val: arr){
            if(val>=num){
                count++;
            }
        }
        return count;
    }
}