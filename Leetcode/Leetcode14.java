// Write a function to find the longest common prefix string amongst an array of strings.

// If there is no common prefix, return an empty string "".

    

// Example 1:

// Input: strs = ["flower","flow","flight"]
// Output: "fl"
// Example 2:

// Input: strs = ["dog","racecar","car"]
// Output: ""
// Explanation: There is no common prefix among the input strings.
    

// Constraints:

// 0 <= strs.length <= 200
// 0 <= strs[i].length <= 200
// strs[i] consists of only lower-case English letters.

import java.util.*;

class Solution {
    public String longestCommonPrefix(String[] strs){
        if(strs.length == 0) return "";
        if(strs.length == 1) return strs[0];
        StringBuilder result = new StringBuilder();
        
        
        for(int i =0; i<strs[0].length(); i++){
            char compared = strs[0].charAt(i);
            
            for(int j = 1; j<strs.length; j++){
                if(compared != strs[j].charAt(i)) return result.toString();
            }
            result.append(compared);
            
        }
        
        return result.toString();
    }
}

public class Main{
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] strs = {"dog","dat"};
        String result = sol.longestCommonPrefix(strs);
        System.out.println(result);
    }
}