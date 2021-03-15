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
    
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            char[][] charArr = new char[strs.length][];
    
            for(int i=0; i<strs.length; i++){
                charArr[i]= strs[i].toCharArray();
            }
            //무사히 2차원 char배열로 잘 들어갔군... 동적할당 따위도 이렇게 헷갈려서야
            
            //아 전래 귀찮은데 js로 풀까..
            
            boolean checker = false;
            String prefix = "";
            
            //char[i][j]
            
            for(int i=0; i<charArr.length; i++){
                for(int j=0; j<charArr[i].length; j++){
                    
                    if(i!=charArr.length-1){
                        if(charArr[i][j] == charArr[i+1][j]){
                            prefix = prefix+""+charArr[i][j];
                            i++;
                        }else
                            j++;
                        
                    }
                }
            }
            //된건가~ 했더니 아녔다
            
            return prefix;
        }
    }
    
    public class Main{
        public static void main(String[] args) {
            Solution sol = new Solution();
            String[] strs = {"flower", "flow", "flight"};
            System.out.println(sol.longestCommonPrefix(strs));
        }
    }