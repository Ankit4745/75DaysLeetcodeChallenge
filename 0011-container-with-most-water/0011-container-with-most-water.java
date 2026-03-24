class Solution {
    public int maxArea(int[] height) {
        int are =0;
        int i=0;
        int j= height.length-1;
        while(i<j){
            int width = j-i;
            int h = Math.min(height[i],height[j]);
            are = Math.max(are,(width*h));
            if(height[i]<height[j]) i++;
            else j--;
        }
        return are;
    }
}