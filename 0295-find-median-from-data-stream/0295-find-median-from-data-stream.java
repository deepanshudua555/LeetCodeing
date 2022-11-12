class MedianFinder {
    PriorityQueue<Integer> maxHeap;
    PriorityQueue<Integer> minHeap;

    public MedianFinder() {
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        minHeap = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        if(maxHeap.isEmpty() && minHeap.isEmpty()){
            maxHeap.offer(num);
        }        
        else{
            if(maxHeap.peek()<num){
                minHeap.offer(num);
            }
            else maxHeap.offer(num);
        }
        int n = maxHeap.size();
        int m = minHeap.size();
        
        if(n-m==2||n-m==-2){
            if(n>m){
                int ele = maxHeap.peek();
                maxHeap.poll();
                minHeap.offer(ele);
            }
            else{
                int ele = minHeap.peek();
                minHeap.poll();
                maxHeap.offer(ele);
            }
        }
    }
    
    public double findMedian() {
        int n = maxHeap.size();
        int m = minHeap.size();
        
        if((n+m)%2==0){
             return ((double)maxHeap.peek()+(double)minHeap.peek())/2.0;
        }
        if(n>m)return (double)maxHeap.peek();
        return minHeap.peek();
    }
}
