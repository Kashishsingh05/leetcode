class Solution {
    public int singleNonDuplicate(int[] nums) {
       /* int n = nums.length;
        if(n==1) return nums[0];
        if(nums[0]!= nums[1]) return nums[0];
        if(nums[n-1] != nums[n-2]) return nums[n-1];
        int low = 1;
        int high = n-2;
        while(low<= high){
            int mid = low+(high-low)/2;
            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]) return nums[mid];

            int first = mid;
            int second = mid;
            if(nums[mid-1]== nums[mid]) first  = mid -1;
            else second = mid+1;

            int leftCount = first - low;
            int rightCount = high - second;

            if(leftCount%2 == 0) low = mid+1;
            else high = mid-1;
        }
        return -1;
        */
        
        int n = nums.length;
        int low =0 ;
        int high =n-1;
        while(low< high){
            int mid = low+(high - low)/2;
            if(mid%2 == 1) mid--;

            if(nums[mid]== nums[mid+1]) low = mid+2;

        else high = mid;
        }
        return nums[low];


    }
}