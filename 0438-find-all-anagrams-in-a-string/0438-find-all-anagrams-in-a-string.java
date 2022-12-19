class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int slen = s.length();
        int plen = p.length();
        
        if(s.length()<p.length())return new ArrayList<>();
        
        int[] pfreq = new int[26];
        int[] window = new int[26];
        
        for(int i=0; i<plen; i++){
            char chp = p.charAt(i);
            char chs = s.charAt(i);
            pfreq[chp-'a']++;
            window[chs-'a']++;
        }
        
        List<Integer>list = new ArrayList<>();
        if(Arrays.equals(pfreq, window))list.add(0);
        
        for(int i=plen; i<slen; i++){
            char ch = s.charAt(i-plen);
            char chsf = s.charAt(i);
            window[ch-'a']--;
            window[chsf-'a']++;
            if(Arrays.equals(pfreq, window))list.add(i-plen+1);
            
        }
        return list;
    }
}