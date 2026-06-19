class Solution {
    public int trap(int[] height) {
        int n= height.length;
        int Lmax[] = new int[n];
        Lmax[0] = height[0];
        for ( int i=1; i<n; i++){
            Lmax[i] = Math.max(Lmax[i-1],height[i]);

        }
        int Rmax[] = new int[n];
        Rmax[n-1] = height[n-1];
        for ( int i=n-2; i>=0; i--){
            Rmax[i] = Math.max(Rmax[i+1],height[i]);
            
        }
        
        int twp=0;
        for (int i=0; i<n; i++){
            int wale = Math.min(Rmax[i],Lmax[i]);
            twp += wale - height[i];
        }
        return twp;
    }
}