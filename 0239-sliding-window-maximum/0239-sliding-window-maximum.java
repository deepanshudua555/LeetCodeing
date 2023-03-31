class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // monotonically decreasing queue
        Deque<Integer> dq = new LinkedList<>();
        int i=0, j=0;
        int size = nums.length;
        int[] arr = new int[size-k+1];
        
        while(j < nums.length) {
            // remove all numbers less than the current number in k range
            while(dq.size() > 0 && dq.peekLast() < nums[j]) {
                dq.pollLast();
            }
            dq.add(nums[j]);
            
            // include all elements of window k
            if((j-i+1)!=k) {
                j++;
            }
            else {
                arr[i] = dq.peekFirst();
                if(arr[i] == nums[i]) {
                    dq.pollFirst();
                }
                i++;
                j++;
            }
        }
        return arr;
    }
}