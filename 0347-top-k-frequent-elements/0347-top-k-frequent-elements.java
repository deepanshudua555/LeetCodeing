class Solution {

    
    
public  class Pair implements Comparable< Pair> {
    int val;
    int freq;


    Pair(int val, int freq) {
      this.val = val;
      this.freq = freq;
     
    }

    public int compareTo(Pair o) {
      return this.freq - o.freq;
    }
  }
    
    
    
    
    
    public int[] topKFrequent(int[] nums, int k) {
        
        Arrays.sort(nums);
        PriorityQueue< Pair> pq = new PriorityQueue<>(Collections.reverseOrder());
        int count=1;
       
        int i=0;
        int j=i+1;
        while(j<nums.length){
            if(nums[i]==nums[j]){
                j++;
                count++;
            }
            else{
                Pair p = new Pair(nums[i],count);
                System.out.println(p.val+" "+p.freq);
                pq.add(p);
                i=j;
                count=0;
            }
        }
        Pair p = new Pair(nums[nums.length-1],count);
        System.out.println(p.val+" "+p.freq);
        pq.add(p);
            
       
        int[] arr = new int[k];
        int l=0;
        while(k>0){
            Pair pp = pq.poll();
            arr[l] = pp.val;
            l++;
            k--;
        }
        return arr;
    }
}