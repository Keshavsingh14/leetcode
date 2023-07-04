class Solution {
     public void moveZeroes(int[] nums) {
        int n = 0; 
        for (int i=0;i<nums.length;i++){
	        if (nums[i]==0){
                n++; 
            }
            else if (n > 0) {
	            int t = nums[i];
	            nums[i]=0;
	            nums[i-n]=t;
            }
        }
    }
}