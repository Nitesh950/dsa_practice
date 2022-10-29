class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
      HashMap<Integer, Integer> maps = new HashMap<>();
      for(Integer element: nums1) {
    	  maps.put(element, maps.getOrDefault(element, 0)+1);
      }
      ArrayList<Integer> list = new ArrayList<>();
      for(Integer element: nums2) {
    	  if(maps.get(element)!=null && maps.get(element)> 0) {
    		  list.add(element);
    		  maps.put(element, maps.getOrDefault(element, 0)-1);
    	  }
      }
      int[] res = new int[list.size()];
      for(int i=0; i<list.size(); i++) {
    	  res[i] = list.get(i);
      }
      return res;
    }
}