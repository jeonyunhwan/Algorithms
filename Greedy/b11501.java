package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
생각 아이디어
우선, 문제에서 제약 조건
1. 주식 사기
2. 원하는 만큼 가지고 있는 주식 팔기
3. 아무것도 안하기

앞에서 부터 구현하면, 최대값 구하고 팔때 구현하기가 까다롭고 힘들다.
따라서 뒤에서 구현하는 것도 방법.
max 값 보다 크면 갱신, 작으면 주식을 팔고 수익 얻는 과정

1 1 3 1 2

과정 1 max - > 2
과정 2 2 - 1 = 1
과정 3 max -> 3
과정 4 3 - 1 = 2
과정 5 3 - 1 = 2
1 + 2 + 2 = 5

자료형 처리 하기 !!!
 */

public class b11501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T--> 0) {
            int N = Integer.parseInt(br.readLine());
            int[] cost = new int[N];
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < N; i++) {
                cost[i] = Integer.parseInt(st.nextToken());
            }
            long max = Integer.MIN_VALUE;
            long res = 0;
            for (int i = N - 1; i >= 0; i--) {
                if (max < cost[i]) {
                    max = cost[i];
                } else {
                    res += (max - cost[i]);
                }
            }
            sb.append(res).append("\n");
        }
        System.out.println(sb);
    }
}
