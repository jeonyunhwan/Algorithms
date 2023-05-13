package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b11729 {
    /*
    하노이 최소 이동
       1. hanoi - > 탑 : 3
                - > 만약 원판(n)이 3개이면?
       1 step ! group mid 로 옮기기
       -> n-1개(1,2) -> 2번탑
       -> 1개(3) -> 3번탑
       -> n-1개(1,2) 3번탑
       2 step ! 그룹 end로 옮기ㄱ기
       -> 1-> 중간기둥으로 옮기기
       -> 1개 - > 3번탑
       -> 1-> 중간기둥에서 목표기둥

       원판이 3개 이상일때도 가능함.
       하노이 최소 이동 공식 2 거듭제곱 - 1;

     */
    public static StringBuilder sb = new StringBuilder();
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        count = 0;
        hanoi(N,1,2,3);
        System.out.println(count);
        System.out.print(sb);
    }
    static void hanoi(int N,int start, int mid, int end){
        count++;

        if(N == 1){
            sb.append(start+" "+end+"\n");
            return;
        }
        // n-1개 중간탑 이동
        hanoi(N-1,start,end,mid);
        sb.append(start+" "+end+"\n");
        hanoi(N-1,mid,start,end);
    }
}
