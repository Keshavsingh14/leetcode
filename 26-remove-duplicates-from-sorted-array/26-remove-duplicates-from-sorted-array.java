class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int l = 0;
        if(n == 1)
            return 1;
        
        for(int i=0; i<n-1; i++){
            if(nums[i] != nums[i+1]){
                nums[l] = nums[i];
                l++;
            }
        }
                
        nums[l] = nums[n-1];        
        return l+1;
    }
}