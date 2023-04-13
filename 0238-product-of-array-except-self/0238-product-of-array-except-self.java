class Solution {
    public int[] productExceptSelf(int[] nums) {
        int temp =1;
        int n = nums.length;
        int[] result = new int[n];
        for(int i=0; i<n; i++){
            result[i] = temp;
            temp *= nums[i];
        }
        temp = 1;
        for(int i = n-1; i>=0; i--){
            result[i] = result[i] * temp;
            temp = temp * nums[i];
        }
        return result;
    }
}