package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

/*
우선순위 큐 사용해야함
묶음 더하고, 다시 오름차순으로 정렬 후 비교가 되어야하기 때문에
우선순위 큐에 맞는 그리디 문제

 */
public class b1715 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(int i =0;i<N;i++){
            pq.offer(Long.parseLong(br.readLine()));
        }
        long res = 0;
        while(pq.size()>1){
            long a = pq.poll();
            long b = pq.poll();
            res += (a+b);
            pq.offer(res);
        }
        System.out.println(res);
    }
}
