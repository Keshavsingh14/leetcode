class Solution {
    public int hIndex(int[] nums) {
        int n = nums.length;
        for(int i =0; i<n; i++){
            if(n-i <= nums[i]){
                return n-i;
            }
        }
        return 0;
    }
}