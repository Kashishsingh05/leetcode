class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        int [] dp = new int [n];
        Arrays.fill(dp,1);
        int max =1;
        for(int i =1; i<n ; i++){
            for(int j = i-1 ; j>=0 ; j--){
                if((nums[i]%nums[j]) ==0){
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
                max =Math.max(max, dp[i]);
            }
        }
        for (int i =n-1 ;i>=0 ;i--){
            if(((ans.size() ==0 && max==dp[i]) || (dp[i]==max && (ans.get(ans.size()-1) % nums[i])==0 )) ){
                ans.add(nums[i]);
                max =max-1;
            }
        }
        return ans;
    }
}