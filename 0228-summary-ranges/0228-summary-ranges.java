class Solution {
    public final static String val = "->";
    public List<String> summaryRanges(int[] nums) {
        if(nums.length==0){
            return new ArrayList<>();
        }
        StringBuilder sb = new StringBuilder();
        List<String> ans = new ArrayList<>();
        sb.append(nums[0]);
        int count = 1;
        
        
        for(int i=0; i<nums.length-1; i++){
            if(nums[i+1] == nums[i]+1){
                count++;
            }else{
                if(count==1){
                    ans.add(sb.toString());
                }
                else{
                    sb.append(val);
                    sb.append(nums[i]);
                    ans.add(sb.toString());
                }
                sb = new StringBuilder();
                sb.append(nums[i+1]);
                count = 1;
            }
        }
        if(count>1){
            sb.append(val);
            sb.append(nums[nums.length-1]);
        }
        ans.add(sb.toString());
        return ans;
        
    }
}  
