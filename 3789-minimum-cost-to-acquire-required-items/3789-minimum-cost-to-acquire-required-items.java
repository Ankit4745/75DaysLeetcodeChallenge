class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long c1 =0;
        long c2 =0;

        long need = Math.min(need1,need2);
        long cost = Math.min((long)cost1+cost2,(long)costBoth);
        
         long total = (long)need*cost;
        c1 = (long)(need1-need) * cost1;
        c2 = (long)(need2-need) * cost2;
        long ans =  total+c1+c2;
        
        
        int maxneed = Math.max(need1,need2);
        long ans1 = (long)maxneed *costBoth;

        return Math.min(ans,ans1);
    }
}