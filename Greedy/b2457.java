package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
3월 1일 부터 11월 30일 까지 매일 한가지 꽃이 피어있도록 한다.
최소 개수의 꽃을 심어야한다.

- 시작 시간을 오름 차순으로 정렬
- 같으면 빠른 순 정렬
- 시작일이 3월 1일 이전, 같으면 갱신
- 꽃의 개수 ++;
- 종료일이 11월 30일 넘어가면 출력

시작시간 : 1*100 = 100+1;

끝나는 시간이 큰걸 선택한다.
 */
public class b2457 {
    static class point{
        int a, b;

        public point(int a,int b){
            this.a = a;
            this.b = b;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<point> list = new ArrayList<>();
        int N  = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i = 0;i<N;i++){
            st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken())*100 + Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken())*100 + Integer.parseInt(st.nextToken());
            list.add(new point(a,b));
        }
        Collections.sort(list, new Comparator<point>() {
            @Override
            public int compare(point o1, point o2) {
                if(o1.a == o2.a){
                    return o1.b - o2.b;
                }
                return o1.a - o2.a;
            }
        });
        int max = 0;
        int idx = 0;
        int res = 0;
        int standard = 301;

        while(standard<1201){
            boolean check = false;

            for(int i = idx;i<N;i++){
                // 301보다 작은 것 break;
                if(list.get(i).a > standard) break;

                if(list.get(i).a <= standard && max < list.get(i).b ){
                    max = list.get(i).b;
                    idx = i+1;
                    check = true;
                }
            }

            if(check){
                standard = max;
                res++;
            }else{
                break;
            }
        }
        if(standard < 1201) System.out.println(0);
        else System.out.println(res);
    }
}
