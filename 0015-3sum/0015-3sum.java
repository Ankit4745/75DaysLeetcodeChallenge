class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lis = new ArrayList<>();
    Arrays.sort(nums);
    
        for (int i=0; i< nums.length ; i++){
            if(i>0 && nums[i]== nums[i-1]) continue;
              int p = i+1;
                  int q = nums.length-1;
                  while(p<q){
             long sum = (long)nums[i] + (long)nums[p] + (long)nums[q];

                    if(sum> 0) q--;
                    else if (sum < 0) p++;
                    else {
                     lis.add(Arrays.asList(nums[i], nums[p], nums[q]));

                        p++;
                        q--;
                        while(p<q && nums[p]== nums[p-1]) p++;
                        while (p<q && nums[q]==nums[q+1]) q--;
                    }
                  }
                

                       

                         
                        
                         
             

               }   
               return lis;   
                }
        }
        
    

