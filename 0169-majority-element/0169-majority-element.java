class Solution {
    public int majorityElement(int[] nums) {
        int curr = 0;
        int count = 1;
        for(int i=1; i<nums.length; i++){
           count += nums[i] == nums[curr] ? 1 : -1;
            if(count == 0){
                curr = ++i;
                count++;
            }
        }
        return nums[curr];
    }
}