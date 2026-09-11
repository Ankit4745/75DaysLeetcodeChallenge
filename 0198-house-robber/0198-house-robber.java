class Solution {

    public int rec(int[] nums,int idx, int[] dp){
        if(idx >= nums.length) return 0;
        if(dp[idx] != -1) return dp[idx];
        int st = nums[idx] + rec(nums,idx+2,dp);
        int sk = rec(nums,idx+1,dp);
        return dp[idx] = Math.max(st,sk);
    }
    public int rob(int[] nums) { 
      
      int[] dp = new int[nums.length];
      Arrays.fill(dp,-1);
      return rec(nums,0,dp);


    }
    }
