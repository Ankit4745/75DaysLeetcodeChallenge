class Node implements Comparable<Node>{
    char ch;
    int count,stTime;
    Node(char ch,int count){
        this.ch = ch;
        this.count = count;
        stTime = 0;
    }
    public int compareTo(Node node2){
        Node node1 = this;
        return node2.count - node1.count;
    }
}

class Solution {
    public int leastInterval(char[] tasks, int n){
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char ch : tasks){
            hm.put(ch,hm.getOrDefault(ch,0) + 1);
        }
        PriorityQueue<Node> pq = new PriorityQueue<>();
        for(char key : hm.keySet()){
            pq.offer(new Node(key,hm.get(key)));
        }
        int currTime = 0;
        while(!pq.isEmpty()){
            Queue<Node> q = new LinkedList<>();
            while(!pq.isEmpty() && pq.peek().stTime > currTime){
                q.offer(pq.poll());
            }
            currTime++;
            if(!pq.isEmpty()){
                Node node = pq.poll();
                node.stTime = currTime + n;
                node.count--;
                if(node.count != 0){
                    pq.offer(node);
                }
            }
            for(Node node : q){
                pq.offer(node);
            }
        }
        return currTime;
    }
}