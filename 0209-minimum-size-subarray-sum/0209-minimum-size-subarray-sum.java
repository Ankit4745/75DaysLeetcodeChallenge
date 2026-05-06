class Solution {
    public int minSubArrayLen(int target, int[] nums) {

     int min = Integer.MAX_VALUE;
     int left = 0;
     int Csum =0;

     for(int i=0; i<nums.length; i++){
        Csum += nums[i];
        while (Csum >= target) {
            if(i - left +1 <min){
                min = i-left+1;
            }
            Csum -= nums[left];
            left++;
        }
     }
    return min != Integer.MAX_VALUE ? min :0;

    }
}