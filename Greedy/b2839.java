package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
설탕 배달 문제

규칙 찾기
5로 나누어지면 바로 출력
안나누어지면 -3 count
만약 N = 2, 1 이면 음수이기 때문에
N < 0 보다 작으면 -1
반복하면 된다.
 */
public class b2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        while(true){

            if(N % 5 == 0){
                count += N % 5;
                break;
            }
            else{
                N-= 3;
                count++;
            }

            if(N < 0){
                count = -1;
                break;
            }

        }
        System.out.println(count);
    }
}
