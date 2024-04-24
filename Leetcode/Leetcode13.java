import java.util.Map;

class Solution {
    public int romanToInt(String input) {
        
        int sum = 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        char[] inputArr = input.toCharArray();
        int leng = inputArr.length;
        
        for(int i=0; i<leng; i++){
            if(i!=leng-1){
                if(map.get(inputArr[i]) < map.get(inputArr[i+1])){
                    sum += map.get(inputArr[i+1])-map.get(inputArr[i]);
                    i++; //wow..
                }else{
                    sum += map.get(inputArr[i]);
                }
            }else{
                sum += map.get(inputArr[i]);
            }
        }
        return sum;
        
    }
}