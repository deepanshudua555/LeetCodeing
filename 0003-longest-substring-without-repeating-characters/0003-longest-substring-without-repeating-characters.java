class Solution {
    public int lengthOfLongestSubstring(String s) {
	    if(s.length()==0||s.length()==1){
            return s.length();
        }
        HashSet<Character> hs = new HashSet<>();
        int i=0,j=0;
        int max = 0;
        int n=s.length();
        while(j<n){
            char c = s.charAt(j);
            if(!hs.contains(c)){
                hs.add(c);
                j++;
            }
            else{
                hs.remove(s.charAt(i));
                i++;
            }
            max = Math.max(max,hs.size());
        }
        return max;
    }
} 