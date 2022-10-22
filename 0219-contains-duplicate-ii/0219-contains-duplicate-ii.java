class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
         Map<Integer, Integer> map = new HashMap<Integer, Integer>();
         for (int i = 0; i < nums.length; i++) {
             int current = nums[i];
             if(map.containsKey(current) && i - map.get(current) <= k){
                 return true;
             }
             else{
                 map.put(current, i);
             }
         }
        return false;
    }
}
