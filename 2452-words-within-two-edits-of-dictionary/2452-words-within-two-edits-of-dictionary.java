class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String>list = new ArrayList<>();
        int c = 0;

        for(int i=0; i<queries.length; i++){
            for(int j=0;j<dictionary.length; j++){
                c=0;
                for(int k=0; k<dictionary[j].length(); k++){
                    if(queries[i].charAt(k)!=dictionary[j].charAt(k)){
                        c++;
                    }
                }
                if(c<=2){
                    list.add(queries[i]);
                    break;
                }
            }
        }
        return list;
    }
}