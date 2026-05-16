class Solution {
    public int maxProduct(int[] nums) {
        int n= nums.length;
        int curr_max = nums[0];
        int result = 0;
        for(int i =1; i<n; i++){
            result = Math.max(result, (nums[i]-1) * (curr_max -1));
            curr_max = Math.max(curr_max, nums[i]);
        }
        return result;
    }
}