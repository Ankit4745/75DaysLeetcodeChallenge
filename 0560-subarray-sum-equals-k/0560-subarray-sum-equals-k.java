class Solution {
    public int subarraySum(int[] nums, int k) {
        int count =0;
        for (int i=0; i< nums.length; i++){
            int currS=0;
            for (int j=i; j<nums.length; j++){
                currS += nums[j];
                if (currS == k){
                    count++;
                }
            }
        }
        return count;
    }
}