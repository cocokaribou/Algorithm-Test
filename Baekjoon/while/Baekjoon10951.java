/*10951
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

input
입력은 여러 개의 테스트 케이스로 이루어져 있다.

각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

output
각 테스트 케이스마다 A+B를 출력한다.
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
*/


import java.util.*;

public class Baekjoon10951{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        
        while(sc.hasNextInt()){
            a = sc.nextInt();
            b = sc.nextInt();
            if(a<=0 && b>=10)
                break;
            else
                System.out.println(a+b);
        }
    }
}
