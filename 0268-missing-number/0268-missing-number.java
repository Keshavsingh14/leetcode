class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int[] temp = new int[len+1];
         for(int i=0; i<len; i++){
             temp[nums[i]]++;
         }
        for(int i=0; i<len; i++){
            if(temp[i]==0)
                return i;
            }
        return len;
        }
}