class Solution {
    public int findPeakElement(int[] nums) {
        int p=0;
        int min =  Integer.MIN_VALUE;
        for (int i=0; i<nums.length; i++){
            if (min<nums[i]){
                 p=i;
                 min = nums[i];
            }
           
        }
        return p; 
    }
}