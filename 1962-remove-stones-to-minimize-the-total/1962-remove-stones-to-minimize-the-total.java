class Solution {
    public int minStoneSum(int[] piles, int k) {
         PriorityQueue<Integer> pq = new PriorityQueue<Integer>( Collections.reverseOrder());
        int n = piles.length;
        int sum=0;
        for(int i=0; i<n; i++){
            sum+=piles[i];
            pq.add(piles[i]);
        }
        
        for(int i=0 ;i<k;i++){
            int t = pq.poll();
            // Syste
            sum = sum-(int)Math.floor(t/2);
            if(t%2==0)pq.add((int)Math.floor(t/2));
            else pq.add((int)Math.floor((t/2)+1));
        }
        return sum;
    }
}