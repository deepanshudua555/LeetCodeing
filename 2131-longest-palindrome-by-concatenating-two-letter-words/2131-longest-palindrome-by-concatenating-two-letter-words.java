class Solution {
    public int longestPalindrome(String[] w) {
        HashMap<String,Integer>map = new HashMap<>();
        int maxi = Integer.MIN_VALUE;
        for(int i=0; i<w.length; i++){
            map.put(w[i], map.getOrDefault(w[i],0)+1);
            
        }
        for (Map.Entry<String, Integer> set :map.entrySet()) {
 
            // Printing all elements of a Map
            // System.out.println(set.getKey() + " = "
            //                    + set.getValue());
            String sk = set.getKey();
            int sv = set.getValue();
            if(sk.charAt(0)==sk.charAt(1) && sv%2==1){
                maxi = Math.max(maxi,sv);
            }
        }
        // System.out.println(maxi+" hi i am maxi");
        String res = "";
        int ans = 0;
        int x=0;
        // System.out.println(map);
        for(int i=0; i<w.length; i++){
            String s = w[i];
            
            String rev = "";
            rev = rev+w[i].charAt(1);
            rev = rev+w[i].charAt(0);
            // System.out.println(rev+" rev");
            if(w[i].charAt(0)==w[i].charAt(1)){
                Integer a = map.get(w[i]);
                // System.out.println(a);
                if(a!=null && a%2==1 && map.get(w[i])==maxi && x==0 ){
                    // System.out.println(a+" hi i m a in if 1 ");
                    ans = ans+ (2*a);
                    map.put(w[i],0);
                    // System.out.println(map); 
                    x++;
                }
                a = map.get(w[i]);
                if(a!=null && a%2==0){
                    // System.out.println(a+" hi i m a in if 2 ");
                    ans = ans+ (2*a);
                    map.remove(w[i]);
                }
                if(a!=null && a%2==1){
                    System.out.println(a+" hi i m a in if 3 ");
                    ans = ans+ (2*(a-1));
                    map.remove(w[i]);
                }
            }
            if( map.containsKey(s) && map.containsKey(rev)){
                Integer b = map.get(w[i]);
                // System.out.println(b+ "HI i m in else");
                ans= ans + 4;
                map.put(s,map.get(s)-1);
                map.put(rev,map.get(rev)-1);
                if(map.get(s)==0){
                    map.remove(s);
                }
                if(map.get(rev)==0){
                    map.remove(rev);
                }
                // System.out.println(map +" hi i m map");
            }
        }
        return ans;
    }
}