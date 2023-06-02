package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
1. 배운점
이중 배열 통해 정렬안해도 되는 방법

2. 생각하기
- 서류 점수 정렬 후 면접 점수 갱신으로 높은 것 count

3. 아이디어만 잘 생각하면 그리디는 편하다.
 */
public class b1946 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-->0){
            int N = Integer.parseInt(br.readLine());
            int[] score = new int[N+1];
            StringTokenizer st;
            for(int i = 0;i<N;i++){
                st = new StringTokenizer(br.readLine()," ");
                int docs = Integer.parseInt(st.nextToken());
                int interview = Integer.parseInt(st.nextToken());
                score[docs] = interview;
            }
            int res = 1;
            int standardScore = score[1];
            for(int i =2;i<N;i++){
                if(score[i] < standardScore){
                    res++;
                    standardScore = score[i];
                }
            }
            System.out.println(res);
        }

    }
}
