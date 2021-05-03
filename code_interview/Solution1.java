class Solution1{
    public String getFormattedString(String input){
        
        List<Character> charList = new ArrayList<>();
        List<Character> intList = new ArrayList<>();
        
        String result = "";
        
        for(int i = 0; i<input.length(); i++){
            char letter = input.charAt(i);
            
            if(letter > 96 && letter < 123)
            {
                charList.add(letter);
            }
            else if(letter > 48 && letter < 58)
            {
                intList.add(letter);
            }
            else
            {
                System.out.println("lower-case alphabets and numbers only");
                return "";
            }
            
            //lower-case alphabet ASCII value 97~122
            //number ASCII value 49~57
        }
        
        
        if(charList.size()-intList.size() >1 || intList.size()-charList.size() >0 )
        {
            return "";
        }
        else
        {
            int i = 0;
            int m = 0;
            
            while(i<charList.size() || i<intList.size()){
                if(i<charList.size()){
                    result += charList.get(i);
                }
                if(i<intList.size()){
                    result += intList.get(i);
                }
                i++;
            }
                
        }
        return result;
    }
}