class Solution {
    public void wiggleSort(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int arr[] = new int[n];
        int ptr = n-1;
        for(int i= 1; i<n; i+=2){
            arr[i] = nums[ptr--];
        }
        for(int i = 0; i < n; i+=2){
            arr[i] = nums[ptr--];
        }
        for(int i = 0; i<n;i++){
            nums[i] = arr[i];
        }
        
    }
    
}