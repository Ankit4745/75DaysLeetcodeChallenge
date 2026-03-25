class Solution {
    public int maxProfit(int[] prices) {
        int bp=  Integer.MAX_VALUE;
        int mpr =0;
        for (int i=0; i<prices.length; i++){
            if (bp< prices[i]){
                int pro = prices[i] - bp;
                mpr = Math.max(pro,mpr);
            } else {
                bp=prices[i];
            }
        } return mpr;
        
    }
}