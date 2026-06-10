class Solution {
    public int[][] merge(int[][] intervals) {
        
        List<int[]> list = new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        list.add(intervals[0]);
        int j=0;
        for (int i=1; i<intervals.length;i++){
            int[] interval = list.get(j);

            if(intervals[i][0] <= interval[1]){
                interval[1] = Math.max(interval[1],intervals[i][1]);
            }
            else {
                list.add(intervals[i]);
                j++;
            }
        }
        int[][] arr = new int[j+1][2];
        for(int i=0;i<j+1;i++){
            arr[i] = list.get(i);
        }

        



        return arr;
    }
}