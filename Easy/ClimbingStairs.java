public class ClimbingStairs {
    // Top-Down, Memoization Approach:
    private int[] dp = new int[46];
    public int climbStairs(int n) {
        if(n == 1) {
            return 1;
        }
        if(n == 2) {
            return 2;
        }
        
        if(dp[n] != 0) {
            return dp[n];
        } else {
            
            dp[n] = climbStairs(n - 1) + climbStairs(n - 2);
            return dp[n];
        }
    }

    // Bottom-Up, Tabulation Approach:
    public int climbStairs2(int n) {
        int[] dp = new int[n + 1];
        
        for(int i = 1; i <= n; i++) {
            if(i == 1) {
                dp[1] = 1;
                continue;
            }
            if(i == 2) {
                dp[2] = 2;
                continue;
            }
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        
        return dp[n];
    }
}
