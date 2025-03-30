class Solution {
    public boolean isPalindrome(int x) {
        
        if(x<0) return false;
        String input = String.valueOf(x);
        String input2 = new StringBuilder(input).reverse().toString();
        return input.equals(input2);
        
    }
}