class KthLargest {
    PriorityQueue<Integer> pri;
    int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        pri = new PriorityQueue<>();
        for (int num : nums){
            add(num);
        }
    }
    
    public int add(int val) {
        if (pri.size() < k || val > pri.peek()){
            pri.add(val);
            if (pri.size() > k){
                pri.poll();
            }
        }
        return pri.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */