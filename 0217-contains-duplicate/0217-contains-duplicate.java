class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean ab= false;
        Arrays.sort(nums);
        for ( int i=1; i<nums.length; i++){
            if( nums[i-1] == nums[i]){
                ab= true;
            }
        }
        return ab; 
    }
}