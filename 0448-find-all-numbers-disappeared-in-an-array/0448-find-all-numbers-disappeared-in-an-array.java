class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i =0; i<nums.length; i++){
            int n = Math.abs(nums[i]);
        if(nums[n-1]>0)
            nums[n-1] = -1*nums[n-1];
        }
        
        for(int j =0; j<nums.length; j++){
            if(nums[j]>0){
                list.add(j+1);
            }
        }
        return list;
        
    }
}