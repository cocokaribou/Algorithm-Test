/*10818
N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

input
첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.

output
첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
*/



import java.util.*;

public class Baekjoon10818{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        //배열 길이 입력받아서 배열 생성
        int len = sc.nextInt();
        int arr[] = new int[len];
        
        //배열[0]부터 [length-1]까지 입력받음
        for(int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }
        
        //배열 오름차순 정렬
        Arrays.sort(arr);
        
        //정렬된 배열의 [0]과 [length-1] 출력
        System.out.println(arr[0]+" "+arr[len-1]);
        
        }
}