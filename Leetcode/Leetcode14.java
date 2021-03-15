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
    public String longestCommonPrefix(String[] strs) {
        
        //글자수순으로 오름차순 정렬부터
        Arrays.sort(strs, Comparator.comparingInt(String::length));
        
        //string 배열의 요소가 하나일 경우(단어가 하나 주어질 경우), 그대로 return
        if(strs.length==1){
            return strs[0];
        }
                
        //string 배열의 요소를 char로 쪼개서 2차원 char배열에 저장
        char[][] charArr = new char[strs.length][];
        for(int i=0; i<strs.length; i++){
            charArr[i]= strs[i].toCharArray();
        }

        String prefix = "";

        //여기가 이제 골때리는데...

        boolean checker = false;
        for(int i=0; i<charArr.length; i++){
            for(int j=0; j<charArr[i].length; j++){
                
                while(i!=charArr.length-1){
                    if(charArr[i][j] == charArr[i+1][j]){
                        checker = true;
                        i++;
                    }else{
                        checker = false;
                        prefix = (prefix.length()>1)? prefix = prefix.substring(0, prefix.length()-1) : "";
                        i++;
                    }
                }if(checker){
                    prefix = prefix+""+charArr[i][j];
                }
            }
        }
        return prefix;
    }
}

public class Main{
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] strs = {"flat", "flow", "flower"};
        String result = sol.longestCommonPrefix(strs);
        System.out.println(result);
    }
}