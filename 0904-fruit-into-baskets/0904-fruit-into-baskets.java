class Solution {
    public int totalFruit(int[] f) {
        int ep =0;
        int sp = 0;
        int sum=0;
        int maxi =0;
        HashMap<Integer,Integer>map = new HashMap<>(); 
        while(ep<f.length){
            map.put(f[ep],map.getOrDefault(f[ep],0)+1);  
            while(map.size()>2){
                // sum = ep-sp+1;
                maxi = Math.max(sum,maxi);
                map.put(f[sp],map.getOrDefault(f[sp],0)-1);            

                if(map.get(f[sp])==0){
                    map.remove(f[sp]);
                }
                
                 sp++;
            }
            
            // sum = ep-sp+1;
            maxi = Math.max(ep-sp+1,maxi);
            ep++;
            
        }
        return maxi;
    }
}