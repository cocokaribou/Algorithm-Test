class Solution2{
    public int countWordMatch(String target, String[] words){
        
        int counter = 0;
        
        
        for(int i =0; i<words.length; i++){
            
            String word = words[i];
            boolean flag = false;
            
            for(int j = 0; j<word.length(); j++){
                if(target.indexOf(word.charAt(j)) != -1){
                    flag = true;
                }else{
                    flag = false;
                    break;
                }
            }
            if(flag != false){
                counter++;
            }            
        }
        
        return counter;
    }
}