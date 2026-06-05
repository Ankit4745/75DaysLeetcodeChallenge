class Solution {

    public int rob(int[] nums) {

        int n = nums.length;

        if(n == 1) return nums[n - 1];

        int[] dp1 = new int[n];
        int[] dp2 = new int[n];

        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);

        int case1 = maximum(n - 2, 0, nums, dp1);

        int case2 = maximum(n - 1, 1, nums, dp2);

        return Math.max(case1, case2);
    }

    public int maximum(int index, int i, int[] nums, int[] dp) {

        if(i == 0 && index == 0) return nums[index];
        if(i == 1 && index == 1) return nums[index];

        if(index < i) return 0;

        if(dp[index] != -1) return dp[index];

        int pick = nums[index] + maximum(index - 2, i, nums, dp);

        int notPick = maximum(index - 1, i, nums, dp);

        return dp[index] = Math.max(pick, notPick);
    }
}