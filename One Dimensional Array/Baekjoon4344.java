/*4344
It is said that 90% of frosh expect to be above average in their class. You are to provide a reality check.

input : The first line of standard input contains an integer C, the number of test cases. C data sets follow. Each data set begins with an integer, N, the number of people in the class (1 <= N <= 1000). N integers follow, separated by spaces, each giving the final grade (an integer between 0 and 100) of a student in the class. 

output : For each case you are to output a line giving the percentage of students whose grade is above average, rounded to 3 decimal places.*/

import java.util.*;

public class Baekjoon4344{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int leng = input.nextInt();
        int inputArr[][] = new int[leng][];
        
        for(int i=0; i<leng; i++){
            int leng2 = input.nextInt();
            inputArr[i] = new int[leng2];
                for(int j = 0; j<leng2; j++){
                    inputArr[i][j] = input.nextInt();
                }
        }
        
        int sum =0;
        double avg =0.0;
        int count = 0;
        for(int i=0; i<leng; i++){
            for(int j=0; j<inputArr[i].length; j++){
                sum += inputArr[i][j];
            }
            avg = sum/(double)inputArr[i].length;
            
            for(int j=0; j<inputArr[i].length; j++){
                if(inputArr[i][j] > avg)
                    count++;
                
            }
            System.out.printf("%,.3f",(count/(double)inputArr[i].length)*100);
            System.out.print("%\n");
            sum =0;
            avg = 0;
            count =0;
        }
        
        
    }
}

