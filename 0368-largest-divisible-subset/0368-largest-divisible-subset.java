class Solution {
    public List<Integer> largestDivisibleSubset(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int dp[] = new int[n];
        //put all the index of dp with 1
        Arrays.fill(dp,1);
        int hash[] = new int[n];
        
        int max = 0;
        int last_index = 0;
        
        for (int cur=1;cur<n;cur++){
            /*
                if n=5
                hash[] = [0,1,2,3,4,5]
                
            */
            
            hash[cur] = cur;
            for (int prev=0;prev<cur;prev++){
                
                // if cur element is divible by prev then we add the dp value
                if (arr[cur] % arr[prev] == 0 && (1+dp[prev] > dp[cur])){
                    dp[cur] = dp[prev] + 1;
                    hash[cur] = prev;
                }
                
            }
            // track the index who has maximum value on the dp array
            // this for printing the list
            if (dp[cur] > max){
                max = dp[cur];
                last_index = cur;
            }
            
        }
        
        
        
        
        List<Integer> list = new ArrayList<>();
        // add the element in list
        list.add(arr[last_index]);
        
        while (hash[last_index] != last_index){
            last_index = hash[last_index];
            list.add(arr[last_index]);
        }
        
        Collections.reverse(list);
        return list;   
    }
}