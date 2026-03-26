class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double count =0;
        for(int i=0; i<k;i++){
            count += nums[i];
        }
        double  max = count;
        for(int i=k;i<nums.length;i++){
            count += nums[i];
            count -= nums[i-k];
            max = Math.max(max,count);
        }
    return max/k;
    }
}