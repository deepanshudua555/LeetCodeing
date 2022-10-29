class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        int n =plantTime.length;
        int[][]pair = new int[plantTime.length][2];
        for(int i=0; i<n; i++){
            pair[i][0] = plantTime[i];
            pair[i][1] = growTime[i];
        }
        Arrays.sort(pair, (a,b)->b[1]-a[1]);
        int t = 0;
        int c= 0;
        for(int[]pa:pair){
            c+=pa[0];
            t = Math.max(t,c+pa[1]);
        }
        return t;
        
    }
}

/*
        
        int t = 0, c = 0;
        
        for (int[] pair : pairs) 
        {
            c += pair[0];
            t = Math.max(t, c + pair[1]);
        }
        
        return t;
    }
}
*/