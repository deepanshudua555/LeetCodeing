class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split("\\s+");
        
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        String ans = "";
        for(int i=arr.length-1;i>=0;i--){
            ans = ans+ arr[i].trim();
            ans+=" ";
        }
        // String anss = ans.subString(0,s.length());
        return ans.trim();
    }
}