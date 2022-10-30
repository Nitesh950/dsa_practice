class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        int count = 0;
        for(int element: arr){
            if(element ==0){
                count++;
                if(count==2){
                    return true;
                }
                continue;
            }
            
            if(search(arr, 2*element)!=-1){
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