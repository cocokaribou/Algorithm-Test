/*1110
0보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때 다음과 같은 연산을 할 수 있다. 먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다. 그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다. 다음 예를 보자.

26부터 시작한다. 2+6 = 8이다. 새로운 수는 68이다. 6+8 = 14이다. 새로운 수는 84이다. 8+4 = 12이다. 새로운 수는 42이다. 4+2 = 6이다. 새로운 수는 26이다.

위의 예는 4번만에 원래 수로 돌아올 수 있다. 따라서 26의 사이클의 길이는 4이다.

N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.

input
첫째 줄에 N이 주어진다. N은 0보다 크거나 같고, 99보다 작거나 같은 정수이다.

output
첫째 줄에 N의 사이클 길이를 출력한다.
*/


import java.util.*;

public class Baekjoon1110{
    public static void main(String[] args){
        
        //10의 자리수, 1의 자리수, 두 자리수의 합을 저장하는 배열
        int arr[] = new int[3];
        //싸이클 수
        int counter=0;
        
        //스캐너로 정수 입력받는다 (0<=input<=99)
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        
        //최초로 입력받은 정수를 변수i에 복사
        int i = input;
        
        //싸이클 시작
        while(true){
               counter++;
            //두 자리수 검사할 필요없음
                arr[0] = i/10;
                arr[1] = i%10;
            
            //자리수 두 개를 더한 합의 1의 자리수를 arr[2]에 저장
            int sum = arr[0] + arr[1];
            arr[2] = sum%10;
            
            
            //(1의 자리수*10) + 합의 1의 자리수 
            if((arr[1]*10 + arr[2])!=input){
                i = arr[1]*10 + arr[2];
             
            }else{
                break;
            }
        }
        System.out.println(counter);
    }
    
}
