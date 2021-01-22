/*3052
Given two integers A and B, A modulo B is the remainder when dividing A by B. For example, the numbers 7, 14, 27 and 38 become 1, 2, 0 and 2, modulo 3. Write a program that accepts 10 numbers as input and outputs the number of distinct numbers in the input, if the numbers are considered modulo 42.

input : The input will contain 10 non-negative integers, each smaller than 1000, one per line. 

output : Output the number of distinct values when considered modulo 42 on a single line. 
*/

import java.util.*;

public class Baekjoon3052{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        //array
        int[] arr = new int[10];
        
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt()%42;
        }
        
        int countArr[] = new int[43];
        int count =0;
        
        //비교
        for(int i = 0; i<arr.length; i++){
            int index = arr[i];
            countArr[index]++;
        }
        
        for(int i:countArr){
            if(i!=0)
                count++;
        }
        
        System.out.println(count);
        
    }
    
}