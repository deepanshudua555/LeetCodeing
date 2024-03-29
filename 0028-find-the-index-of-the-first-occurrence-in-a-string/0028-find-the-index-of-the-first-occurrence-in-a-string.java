class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty() || haystack.equals(needle)) return 0;       
        
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            String subString = haystack.substring(i, i + needle.length());
            if (subString.equals(needle)) return i;
        }
        
        return -1;
    }
}