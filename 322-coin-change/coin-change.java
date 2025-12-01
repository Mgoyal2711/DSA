class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[] = new int[amount + 1];
        for (int i = 0; i <= amount; i++) {
            dp[i] = 1000000;
        }
        dp[0] = 0;
        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }
        if (dp[amount] == 1000000) {
            return -1;
        }
        return dp[amount];
    }
}