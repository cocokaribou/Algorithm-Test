class Solution {
    public boolean isPalindrome(int x) {
        
        if(x<0) return false;
        String input = String.valueOf(x);
        String input2 = new StringBuilder(input).reverse().toString();

        //String indexing in Java -> StringBuilder class
        //convert StringBuilder object to String by using toString()
        boolean result = input.equals(input2);
        return result;
        
    }
}