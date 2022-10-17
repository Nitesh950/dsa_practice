class Solution {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> maps = new HashMap<>();
		for(int i=0; i<nums.length;i++){
            int remaining = target-nums[i];
            if(maps.containsKey(remaining)) {
            	return new int[] {i, maps.get(remaining)};
            }else {
            	maps.put(nums[i], i);
            }
        }
		return new int[] {};
    }
}