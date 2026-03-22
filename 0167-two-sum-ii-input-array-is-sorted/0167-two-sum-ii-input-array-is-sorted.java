class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] arr = new int[2];

        int i=0,j=numbers.length-1;
        while(i<j){
            int k = numbers[i]+numbers[j];
            if(  k== target){
                arr[0] = i+1;
                arr[1] = j+1;
                break;
            }else if(k> target){
                j--;
            }else {
                i++;
            }
        }
        return arr;
    }
}