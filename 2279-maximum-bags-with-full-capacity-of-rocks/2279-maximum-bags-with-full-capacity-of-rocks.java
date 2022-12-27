class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        Integer[] arr = new Integer[rocks.length];
        int n = rocks.length;
        for(int i=0; i<n;i++){
            arr[i] = capacity[i]-rocks[i];
        }
        Arrays.sort(arr);
        int count = 0;
        for(int i=0; i<n;i++){
            if(arr[i]==0)count++;
            else if(additionalRocks-arr[i]>=0){
                additionalRocks-=arr[i];
                count++;
            }
        }
        return count;
    }
}