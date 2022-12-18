class Solution {
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        StringBuffer ob=new StringBuffer();
        for(int i=0;i<arr.length;i++)
            ob.append(reverse(arr[i])+" ");
        return ob.toString().trim();
    }
    private String reverse(String s){
        return new StringBuffer(s).reverse().toString();
    }
}