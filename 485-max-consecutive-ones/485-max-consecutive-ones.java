class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int start = 0;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                max = Math.max(max, i - start + 1);
                }
            else{
                start = i + 1; 
            }
        }
        return max;
        
    }
}