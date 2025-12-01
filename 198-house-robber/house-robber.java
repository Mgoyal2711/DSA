class Solution {
    public int rob(int[] nums) {
        int prev1 = 0, prev2 = 0;
        for (int money : nums) {
            int curr = Math.max(prev2 + money, prev1);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}