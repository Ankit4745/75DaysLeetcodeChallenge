class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> list = new HashMap<>();
        for(int num: nums){
            list.put(num,list.getOrDefault(num,0)+1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> list.get(a) - list.get(b));

        for(int key : list.keySet()){
                pq.add(key);
                if(pq.size() > k){
                pq.poll();
            }
        }
        int[] ans = new int[k];
        int i=0;


        while(!pq.isEmpty()){
            ans[i++] = pq.poll();
        }

        return ans;
    }
}