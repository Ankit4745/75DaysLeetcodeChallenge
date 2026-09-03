class Solution {
    public boolean uniformArray(int[] nums1) {
        

        
        boolean a = false;
        int p =0;
       
        
        for(int i=0;i<nums1.length;i++){
         
            if(nums1[i] % 2 == 0){
                a = true;
               
              
            }else{
                a = false;
                break;
            }
        }
        
        
        boolean c = false ;
       Arrays.sort(nums1);
        if(nums1[0] % 2 != 0){
            c = true ;
        }
        if((a || c) ){
            return true;
            
        }else {
           return false;
        }
        
    }
}