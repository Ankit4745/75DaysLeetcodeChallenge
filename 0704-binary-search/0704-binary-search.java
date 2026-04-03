class Solution {
    public int search(int[] nums, int target) {
        int p= Integer.MIN_VALUE;
        for (int i=0; i<nums.length; i++){
            if (nums[i] == target){
                p=i;
                break;
            }
            
        }
        if ( p ==  Integer.MIN_VALUE){
            p=-1;
        }
        return p;
    }
}