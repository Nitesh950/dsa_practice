class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(search(arr, arr[i]*2) != -1 && search(arr, arr[i]*2) != i){
                return true;
            }
        }
        return false;
    }
    
     public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid] > target){
                high = mid-1;
            }else{
                low = mid + 1;
            }
        }
        return -1;
    }
}