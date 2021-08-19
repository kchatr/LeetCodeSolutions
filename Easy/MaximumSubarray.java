public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = dp[0];
        
        for(int i = 1; i < nums.length; i++) {
            dp[i] = nums[i] > (nums[i] + dp[i - 1]) ? nums[i] : nums[i] + dp[i - 1];
            
            if(dp[i] > max) {
                max = dp[i];
            }
        }
        
        return max;
    }
}
