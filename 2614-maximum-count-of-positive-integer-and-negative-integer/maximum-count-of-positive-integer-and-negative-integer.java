class Solution {
    public int lowerBound(int[] nums , int target){
        int low=0;
        int high = nums.length;
        while(low< high){
            int mid = low+(high-low)/2;
            if(nums[mid] < target) low = mid+1;
            else  high = mid;
        }
        return low;
    }
    public int maximumCount(int[] nums) {
        int negative = lowerBound(nums ,0);
        int positive = nums.length - lowerBound(nums,1);

        return Math.max(positive, negative);
        
    }
}