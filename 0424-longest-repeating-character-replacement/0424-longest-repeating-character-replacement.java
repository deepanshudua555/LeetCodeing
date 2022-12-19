class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> hm = new HashMap<>();
        int i=0,j=0,res=0;
        while(j<s.length()){
            int windowSize = j-i+1;
            hm.put(s.charAt(j),hm.getOrDefault(s.charAt(j),0)+1);
            
            int maxValueInMap=(Collections.max(hm.values()));
            
            if(windowSize-maxValueInMap<=k){
                res=Math.max(res,windowSize);
            }else{
                if(hm.get(s.charAt(i))>0){
                    hm.put(s.charAt(i),hm.get(s.charAt(i))-1);
                }else{
                    hm.remove(s.charAt(i));
                } 
                i++;
            }
            j++;
        }
        return res;
    }
}