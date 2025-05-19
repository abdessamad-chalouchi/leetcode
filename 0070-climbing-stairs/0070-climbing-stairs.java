class Solution {
    private int[] dp;
    public int climbStairs(int n) {
        dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return countWays(n);
    }
    private int countWays(int n) {
        if (n == 1 || n == 2) return n; // Base case
        if (dp[n] != -1) return dp[n]; // Return memoized value
        dp[n] = countWays(n - 1) + countWays(n - 2); // Compute and 
        return dp[n]; // Return computed value
    }
}