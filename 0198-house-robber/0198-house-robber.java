class Solution {
    public int rob(int[] nums) { 
        int even =0;
        int odd =0;
        for(int i = 0; i < nums.length; i++){
            int take = odd + nums[i];
            int skip = even;
            int current = Math.max(take , skip );
            odd = even;
            even = current;
        }
        return even;
    }
}