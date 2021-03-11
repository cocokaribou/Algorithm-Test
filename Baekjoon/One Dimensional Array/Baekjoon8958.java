/*8958
There is an objective test result such as “OOXXOXXOOO”. An ‘O’ means a correct answer of a problem and an ‘X’ means a wrong answer. The score of each problem of this test is calculated by itself and its just previous consecutive ‘O’s only when the answer is correct. For example, the score of the 10th problem is 3 that is obtained by itself and its two previous consecutive ‘O’s. 

Therefore, the score of “OOXXOXXOOO” is 10 which is calculated by “1+2+0+0+1+0+0+1+2+3”. 

You are to write a program calculating the scores of test results. 

input : Your program is to read from standard input. The input consists of T test cases. The number of test cases T is given in the first line of the input. Each test case starts with a line containing a string composed by ‘O’ and ‘X’ and the length of the string is more than 0 and less than 80. There is no spaces between ‘O’ and ‘X’. 

output : Your program is to write to standard output. Print exactly one line for each test case. The line is to contain the score of the test case. 
*/

import java.util.*;

public class Baekjoon8958{
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);

        int leng = input.nextInt();

        String[] inputArr = new String[leng];
        int[] countArr = new int[leng];
        
        for(int i=0; i<leng; i++){
            inputArr[i] = input.next();
        }
        
        int counter=0;
        int sum =0;

        for(int i=0; i<leng; i++){
            for(int j=0; j<inputArr[i].length(); j++){
                if(inputArr[i].charAt(j) == 'O'){
                    counter++;
                    sum +=counter;
                }
                else if(inputArr[i].charAt(j) == 'X')
                    counter=0;
            }
            countArr[i] = sum;
            counter=0;
            sum=0;
        }
        
        for(int j:countArr){
            System.out.println(j);
        }
    }
}

