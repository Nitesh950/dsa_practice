class Solution {
   public int[] intersection(int[] nums1, int[] nums2) {
		HashSet<Integer> set = new HashSet<>();
		
		for(int element: nums1) {
			set.add(element);
		}
		ArrayList<Integer> list = new ArrayList<>();
		for(int element: nums2) {
			if(set.contains(element)) {
				list.add(element);
				set.remove(element);
			}
		}
		int[] res = new int[list.size()];
		for(int i=0; i<list.size(); i++) {
			res[i] = list.get(i);
		}
		return res;
    }
}