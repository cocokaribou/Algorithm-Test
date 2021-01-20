/*1157
알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.

input : 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.

output : 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.*/


import java.util.*;

public class Baekjoon1157{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        
        //대소문자 구분이 없으므로 입력값을uppercase처리
        String input = (sc.nextLine()).toUpperCase();
        
        //입력값을 한글자씩 담은 배열
        String[] inputArr = input.split("");
        
        //알파벳을 카운트할 배열 0=A, 1=B, 2=C...
        int[] countArr = new int[26];
        
        for(int i=0; i<inputArr.length; i++){
            char ch = inputArr[i].charAt(0);
            int i2 = ch-65;
            countArr[i2]++;
        }
        
        int max = 0;
        for(int i=1; i<countArr.length; i++){
            if(countArr[max] < countArr[i]){
                max = i;
            }
        }
        
        for(int i=0; i<countArr.length; i++){
            if(countArr[i]==countArr[max] && i != max){
                System.out.println("?");
                return;
            }
        }
        
        char result = (char)(max+65);
        System.out.println(result);
    }
}
