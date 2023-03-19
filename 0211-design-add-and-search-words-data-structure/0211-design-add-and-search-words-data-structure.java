class WordDictionary {
    ArrayList<String> arr;
    public WordDictionary() {
        arr=new ArrayList<String>();
    }
    
    public void addWord(String word) {
        arr.add(word);
    }
    
    public boolean search(String word) {
        
        if(word.contains(".")){
            int n = word.length();
            for(String s : arr){
                boolean hasWord = true;
                if(s.length() == n){
                    for(int i=0;i<n;i++){
                        if(word.charAt(i)=='.')
                            continue;
                        if(word.charAt(i)!=s.charAt(i)){
                            hasWord=false;
                            break;
                        }
                    }
                    if(hasWord) return true;
                }
            }
        }
        else{
            return arr.contains(word);
        }
        return false;   
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */